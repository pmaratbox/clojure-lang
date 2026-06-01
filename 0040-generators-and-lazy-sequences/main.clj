(require '[clojure.string :as str])

(def squares (map #(* % %) (iterate inc 1)))

(println (str/join " " (take 3 squares)))
