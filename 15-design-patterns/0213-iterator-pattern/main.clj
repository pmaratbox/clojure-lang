(defn make-iter [start end]
  (let [state (atom start)]
    {:has-next (fn [] (<= @state end))
     :next     (fn [] (let [v @state] (swap! state inc) v))}))

(let [it (make-iter 1 3)
      out (loop [acc []]
            (if ((:has-next it))
              (recur (conj acc ((:next it))))
              acc))]
  (println (apply str (interpose " " out))))
