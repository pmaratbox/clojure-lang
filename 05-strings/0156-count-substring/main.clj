(def text "ababab")
(def needle "ab")
(loop [i 0 n 0]
  (let [j (clojure.string/index-of text needle i)]
    (if j
      (recur (+ j (count needle)) (inc n))
      (println n))))
