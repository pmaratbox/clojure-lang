(def xf (comp (map inc) (filter even?)))

(apply println (sequence xf [1 2 3 4]))
