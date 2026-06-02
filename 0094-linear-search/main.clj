(def nums [4 2 7 1 9])
(def target 7)
(def index (first (keep-indexed (fn [i n] (when (= n target) i)) nums)))
(println (str "found " target " at index " index))
