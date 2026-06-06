;; combineLatest of two timed streams using a virtual-time scheduler.

;; --- Virtual-time scheduler -------------------------------------------------
;; State: a sorted set of events [time seq callback] plus a seq counter and clock.
(def scheduler (atom {:events [] :seq 0 :clock 0}))

(defn schedule
  "Enqueue cb to run at virtual time t. Returns nothing useful here."
  [t cb]
  (swap! scheduler
         (fn [{:keys [events seq] :as s}]
           (-> s
               (assoc :events (conj events [t seq cb]))
               (assoc :seq (inc seq))))))

(defn run
  "Repeatedly pop the smallest [time seq] event, advance the clock, invoke it."
  []
  (loop []
    (let [{:keys [events]} @scheduler]
      (when (seq events)
        (let [sorted (sort-by (fn [[t s _]] [t s]) events)
              [[t _ cb] & rest] sorted]
          (swap! scheduler #(-> % (assoc :events (vec rest)) (assoc :clock t)))
          (cb)
          (recur))))))

;; --- combineLatest ----------------------------------------------------------
(def latest-a (atom nil))
(def latest-b (atom nil))

(defn emit-if-ready []
  (let [a @latest-a b @latest-b]
    (when (and (some? a) (some? b))
      (println (str "(" a ", " b ")")))))

;; Source A schedules (1->1),(3->2); source B schedules (2->10).
(schedule 1 (fn [] (reset! latest-a 1) (emit-if-ready)))
(schedule 3 (fn [] (reset! latest-a 2) (emit-if-ready)))
(schedule 2 (fn [] (reset! latest-b 10) (emit-if-ready)))

(run)
