;; Multiset as an atom holding a map from element to count.
(def ms (atom {}))

(defn add! [x] (swap! ms update x (fnil inc 0)))

(defn remove! [x]
  (swap! ms (fn [m]
              (let [n (dec (get m x 0))]
                (if (pos? n) (assoc m x n) (dissoc m x))))))

(defn count-of [x] (get @ms x 0))

(add! 1)
(add! 1)
(add! 2)
(let [a (count-of 1)]
  (remove! 1)
  (println (str a " " (count-of 1))))
