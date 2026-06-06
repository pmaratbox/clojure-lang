;; Merge of two timed streams using a virtual-time scheduler.

(defn make-scheduler []
  (atom {:queue [] :seq 0 :clock 0}))

(defn schedule [sched t cb]
  (let [token (:seq @sched)]
    (swap! sched
           (fn [{:keys [queue seq] :as s}]
             (-> s
                 (assoc :queue (conj queue {:time t :seq seq :cb cb :dead false}))
                 (assoc :seq (inc seq)))))
    token))

(defn cancel [sched token]
  (swap! sched update :queue
         (fn [q]
           (mapv #(if (= (:seq %) token) (assoc % :dead true) %) q))))

(defn run [sched]
  (loop []
    (let [{:keys [queue]} @sched]
      (when (seq queue)
        (let [sorted (sort-by (juxt :time :seq) queue)
              ev (first sorted)
              rest-q (vec (rest sorted))]
          (swap! sched assoc :queue rest-q :clock (:time ev))
          (when-not (:dead ev)
            ((:cb ev)))
          (recur))))))

(defn source [sched events]
  (fn [observer]
    (doseq [[t v] events]
      (schedule sched t #((:next observer) v)))))

(defn merge-streams [sched s1 s2]
  (fn [observer]
    (s1 observer)
    (s2 observer)))

(def sched (make-scheduler))

(def stream-a (source sched [[10 1] [30 3] [50 5]]))
(def stream-b (source sched [[20 2] [40 4] [60 6]]))

(def merged (merge-streams sched stream-a stream-b))

(merged {:next (fn [v] (println v))})

(run sched)
