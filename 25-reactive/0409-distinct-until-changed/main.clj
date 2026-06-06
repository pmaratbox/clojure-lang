;; distinctUntilChanged: forward a value only when it differs from the last emitted one.

(defn observable-of
  "Returns an Observable (a function of an observer) that synchronously
   emits each value in xs then completes."
  [xs]
  (fn [observer]
    (doseq [x xs]
      ((:next observer) x))
    ((:complete observer))))

(defn distinct-until-changed
  "Operator: drops consecutive duplicate values from the source."
  [source]
  (fn [observer]
    (let [last (atom ::none)]
      (source {:next     (fn [x]
                           (when (not= @last x)
                             (reset! last x)
                             ((:next observer) x)))
               :error    (:error observer identity)
               :complete (:complete observer)}))))

(def source (observable-of [1 1 2 2 2 3 1]))

((distinct-until-changed source)
 {:next     (fn [x] (println x))
  :complete (fn [] nil)})
