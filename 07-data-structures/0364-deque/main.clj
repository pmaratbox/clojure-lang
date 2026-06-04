;; Double-ended queue backed by an atom holding a vector.
(def dq (atom []))

(defn push-back! [x] (swap! dq conj x))
(defn push-front! [x] (swap! dq #(into [x] %)))

(push-back! 1)
(push-back! 2)
(push-front! 0)

(println (apply str (interpose " " @dq)))
