(def xs ["a" "b" "a" "c" "b" "a"])

(def top
  (->> (frequencies xs)
       (sort-by val >)
       (take 2)
       (map key)))

(println (apply str (interpose " " top)))
