(defn majority [xs]
  (:cand (reduce (fn [{:keys [cand count]} x]
                   (cond
                     (zero? count) {:cand x :count 1}
                     (= x cand) {:cand cand :count (inc count)}
                     :else {:cand cand :count (dec count)}))
                 {:cand nil :count 0}
                 xs)))

(println (majority [2 2 1 2 3 2]))
