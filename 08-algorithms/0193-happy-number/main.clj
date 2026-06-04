(defn sum-sq-digits [n]
  (reduce (fn [acc d] (+ acc (* d d)))
          0
          (map #(- (int %) (int \0)) (str n))))

(defn happy? [n]
  (loop [n n seen #{}]
    (cond
      (= n 1) true
      (seen n) false
      :else (recur (sum-sq-digits n) (conj seen n)))))

(println (if (happy? 19) "yes" "no"))
