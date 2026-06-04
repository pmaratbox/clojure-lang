(def pattern "ab")
(def text "aab")

(defn first-match [pat txt]
  (loop [i 0 state 0]
    (cond
      (= state (count pat)) (- i (count pat))
      (>= i (count txt)) -1
      :else (let [c (nth txt i)]
              (cond
                (= c (nth pat state)) (recur (inc i) (inc state))
                (= c (first pat)) (recur (inc i) 1)
                :else (recur (inc i) 0))))))

(println (first-match pattern text))
