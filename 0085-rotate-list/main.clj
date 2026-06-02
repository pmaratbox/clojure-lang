(def nums [1 2 3 4 5])
(def k 2)
(println (clojure.string/join " " (concat (drop k nums) (take k nums))))
