(def a "abcd")
(def b "cdab")
(def rotation?
  (and (= (count a) (count b))
       (clojure.string/includes? (str a a) b)))
(println (if rotation? "yes" "no"))
