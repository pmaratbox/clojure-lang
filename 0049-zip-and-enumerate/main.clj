(require '[clojure.string :as str])

(def letters ["a" "b" "c"])
(def nums [1 2 3])
(def pairs (map (fn [k n] (str k "=" n)) letters nums))

(println (str/join " " pairs))
