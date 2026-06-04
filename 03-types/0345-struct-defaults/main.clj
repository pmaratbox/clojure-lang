(def default-point {:x 0 :y 0})

(defn point [overrides]
  (merge default-point overrides))

(defn show [p]
  (println (:x p) (:y p)))

(show (point {}))
(show (point {:x 5}))
