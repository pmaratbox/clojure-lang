(def strs ["flower" "flow" "flight"])
(def prefix
  (apply str
         (for [col (range (apply min (map count strs)))
               :let [c (nth (first strs) col)]
               :while (every? #(= c (nth % col)) strs)]
           c)))
(println prefix)
