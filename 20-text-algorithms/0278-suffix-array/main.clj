(defn suffix-array [^String s]
  (->> (range (count s))
       (sort-by #(subs s %))
       vec))

(println (apply str (interpose " " (suffix-array "banana"))))
