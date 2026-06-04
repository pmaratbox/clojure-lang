(def merged (merge {:a 1 :b 2} {:b 3 :c 4}))

(println (apply str
                (interpose " "
                           (for [k (sort (keys merged))]
                             (str (name k) ":" (merged k))))))
