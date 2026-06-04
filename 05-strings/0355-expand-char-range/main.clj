(def spec "a-e")

(def start (int (nth spec 0)))
(def end (int (nth spec 2)))

(def result
  (apply str (map char (range start (inc end)))))

(println result)
