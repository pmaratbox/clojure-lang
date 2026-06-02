(require '[clojure.string :as str])

(def parts (str/split "a,b,c" #","))
(def upper (map str/upper-case parts))

(println (str/join "-" upper))
