(defn merge-seqs [left right]
  (loop [l left
         r right
         result []]
    (cond
      (empty? l) (into result r)
      (empty? r) (into result l)
      (<= (first l) (first r)) (recur (rest l) r (conj result (first l)))
      :else (recur l (rest r) (conj result (first r))))))

(defn merge-sort [items]
  (if (<= (count items) 1)
    items
    (let [mid (quot (count items) 2)]
      (merge-seqs (merge-sort (subvec items 0 mid))
                  (merge-sort (subvec items mid))))))

(def data [3 1 4 1 5 2])
(println (clojure.string/join " " (merge-sort data)))
