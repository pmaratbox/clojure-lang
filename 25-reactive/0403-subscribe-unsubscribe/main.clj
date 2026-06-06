;; Subscribe returns a Subscription with unsubscribe().
;; The producer checks a "closed" atom before every next; once the
;; consumer unsubscribes, the source stops delivering further values.

(defn observable [produce]
  ;; subscribe builds the subscription first, then lets the consumer
  ;; (built from the subscription) drive the gated producer.
  (fn [make-observer]
    (let [closed (atom false)
          subscription {:unsubscribe (fn [] (reset! closed true))}
          observer (make-observer subscription)
          safe-observer {:next (fn [v]
                                 (when-not @closed
                                   ((:next observer) v)))}]
      (produce safe-observer)
      subscription)))

(def source
  (observable
    (fn [observer]
      ;; Would push 1,2,3,4; each next is gated by the closed flag.
      (doseq [v [1 2 3 4]]
        ((:next observer) v)))))

;; subscribe wires the consumer, which unsubscribes after the 2nd value.
(source (fn [subscription]
          {:next (fn [v]
                   (println v)
                   (when (= v 2)
                     ((:unsubscribe subscription))))}))
