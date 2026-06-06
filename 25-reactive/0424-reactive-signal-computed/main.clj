;; Fine-grained reactivity: a writable signal and a derived computed.
;; A signal holds a value and a list of subscribers; a computed registers a
;; recompute callback as a subscriber of the signals it reads and caches its result.

(defn signal [init]
  (let [state (atom {:value init :subs []})]
    {:get (fn [] (:value @state))
     :sub (fn [cb] (swap! state update :subs conj cb))
     :set (fn [v]
            (swap! state assoc :value v)
            (doseq [cb (:subs @state)] (cb)))}))

(defn computed [fns f]
  (let [cache (atom nil)
        recompute (fn [] (reset! cache (f)))]
    (recompute)
    (doseq [s fns] ((:sub s) recompute))
    (fn [] @cache)))

(def a (signal 2))
(def b (signal 3))
(def sum (computed [a b] (fn [] (+ ((:get a)) ((:get b))))))

(println (sum))
((:set a) 10)
(println (sum))
