(def text "hello_world")

(defn capitalize-first [s]
  (if (empty? s)
    s
    (str (Character/toUpperCase (first s)) (subs s 1))))

(def words (.split text "_"))

(def result
  (apply str (first words) (map capitalize-first (rest words))))

(println result)
