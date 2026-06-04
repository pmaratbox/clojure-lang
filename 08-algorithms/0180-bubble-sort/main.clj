(defn bubble-sort [v]
  (loop [v v]
    (let [swapped (reduce (fn [acc i]
                            (if (> (acc i) (acc (inc i)))
                              (assoc acc i (acc (inc i)) (inc i) (acc i))
                              acc))
                          v
                          (range (dec (count v))))]
      (if (= swapped v)
        swapped
        (recur swapped)))))

(println (clojure.string/join " " (bubble-sort [5 1 4 2 8])))
