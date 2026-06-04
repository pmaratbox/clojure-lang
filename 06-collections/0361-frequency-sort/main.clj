(def xs [1 1 2 3 3 3])

(def counts (frequencies xs))

;; first-seen order of distinct values, then stable sort by count desc
(def order (distinct xs))

(def result
  (mapcat (fn [v] (repeat (counts v) v))
          (sort-by counts > order)))

(println (apply str (interpose " " result)))
