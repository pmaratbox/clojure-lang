(defn make-shape [name]
  (case name
    "circle" {:kind "circle"}
    "square" {:kind "square"}))

(let [c (make-shape "circle")
      s (make-shape "square")]
  (println (:kind c) (:kind s)))
