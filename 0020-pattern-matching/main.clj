(defn word [n]
  (case n
    1 "one"
    2 "two"
    "many"))

(doseq [n [1 2 5]]
  (println (str n ": " (word n))))
