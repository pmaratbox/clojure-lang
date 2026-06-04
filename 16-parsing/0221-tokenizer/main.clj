(defn tokenize [s]
  (->> s
       (remove #(= \space %))
       (map (fn [c] (if (Character/isDigit c) "NUM" (when (= c \+) "PLUS"))))
       (remove nil?)))

(println (apply str (interpose " " (tokenize "1 + 2"))))
