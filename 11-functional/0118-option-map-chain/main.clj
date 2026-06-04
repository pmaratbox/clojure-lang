(defn map-opt [f x]
  (when (some? x) (f x)))

(def present (map-opt #(+ % 2) 10))
(def absent (map-opt #(+ % 2) nil))

(println (or present "none") (or absent "none"))
