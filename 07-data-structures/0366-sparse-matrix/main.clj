;; Sparse matrix storing only nonzero entries in a map keyed by [row col].
(def matrix (atom {}))

(defn mset! [r c v] (swap! matrix assoc [r c] v))
(defn mget [r c] (get @matrix [r c] 0))

(mset! 1 1 5)
(println (str (mget 1 1) " " (mget 0 0)))
