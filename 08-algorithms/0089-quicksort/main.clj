(defn quicksort [items]
  (if (<= (count items) 1)
    items
    (let [pivot (first items)
          rest-items (rest items)
          less (filter #(< % pivot) rest-items)
          greater (filter #(>= % pivot) rest-items)]
      (concat (quicksort less) [pivot] (quicksort greater)))))

(println (clojure.string/join " " (quicksort [3 1 4 1 5 2])))
