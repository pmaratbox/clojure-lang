(defn binom [n k]
  (reduce (fn [acc i] (quot (* acc (- n (dec i))) i))
          1
          (range 1 (inc k))))

(println (binom 5 2))
