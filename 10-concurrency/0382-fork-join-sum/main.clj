(defn fork-sum [coll]
  (if (<= (count coll) 1)
    (reduce + 0 coll)
    (let [mid (quot (count coll) 2)
          left (future (fork-sum (subvec coll 0 mid)))
          right (future (fork-sum (subvec coll mid)))]
      (+ @left @right))))

(println (fork-sum (vec (range 1 9))))
