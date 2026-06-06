;; Virtual-time scheduler: a priority queue of [time seq cb], no real time.
(def scheduler (atom {:seq 0 :queue [] :now 0 :dead #{}}))

(defn schedule [t cb]
  (let [s (:seq @scheduler)]
    (swap! scheduler
           (fn [st]
             (-> st
                 (update :seq inc)
                 (update :queue conj [t s cb]))))
    s))

(defn cancel [token]
  (swap! scheduler update :dead conj token))

(defn run []
  (loop []
    (let [{:keys [queue dead]} @scheduler
          live (remove (fn [[_ s _]] (contains? dead s)) queue)]
      (when (seq live)
        (let [[t s cb] (first (sort-by (fn [[t s _]] [t s]) live))]
          (swap! scheduler
                 (fn [st]
                   (-> st
                       (assoc :now t)
                       (update :queue (fn [q] (vec (remove (fn [[_ qs _]] (= qs s)) q)))))))
          (cb)
          (recur))))))

;; debounce(window): on each value, cancel pending emit and schedule at now+window.
(defn debounce [window emit]
  (let [pending (atom nil)]
    {:next (fn [v]
             (when-let [tok @pending] (cancel tok))
             (let [now (:now @scheduler)]
               (reset! pending (schedule (+ now window) (fn [] (emit v))))))}))

;; Source schedules ("a"@10),("b"@20),("c"@100); window=30.
(let [obs (debounce 30 #(println %))]
  (schedule 10 #((:next obs) "a"))
  (schedule 20 #((:next obs) "b"))
  (schedule 100 #((:next obs) "c"))
  (run))
