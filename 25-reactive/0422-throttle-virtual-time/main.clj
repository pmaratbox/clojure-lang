;; Virtual-time scheduler: a priority queue of [time seq cb], driven by run.
(def clock (atom 0))
(def seq-counter (atom 0))
(def queue (atom []))

(defn schedule [t cb]
  (let [s (swap! seq-counter inc)]
    (swap! queue conj {:time t :seq s :cb cb})
    s))

(defn run []
  (while (seq @queue)
    (let [evt (->> @queue (sort-by (juxt :time :seq)) first)]
      (swap! queue (fn [q] (vec (remove #(= (:seq %) (:seq evt)) q))))
      (reset! clock (:time evt))
      ((:cb evt)))))

;; throttle(window), leading edge: emit a value only when now >= block-until.
(defn throttle [window emit]
  (let [block-until (atom 0)]
    (fn [v]
      (when (>= @clock @block-until)
        (emit v)
        (reset! block-until (+ @clock window))))))

;; Source schedules its events at the given virtual times.
(let [out (throttle 30 println)]
  (doseq [[v t] [["a" 10] ["b" 20] ["c" 100] ["d" 110]]]
    (schedule t (fn [] (out v)))))

(run)
