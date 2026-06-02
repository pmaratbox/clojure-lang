(def pq (java.util.PriorityQueue.))
(doseq [n [3 1 2]]
  (.add pq n))

(loop [out []]
  (if (.isEmpty pq)
    (println (clojure.string/join " " out))
    (recur (conj out (str (.poll pq))))))
