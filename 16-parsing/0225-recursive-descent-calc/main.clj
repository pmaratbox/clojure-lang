(defn tokenize [s]
  (remove #(= \space %) s))

(declare parse-expr)

(defn parse-factor [tokens]
  [(- (int (first tokens)) (int \0)) (rest tokens)])

(defn parse-term [tokens]
  (loop [[v ts] (parse-factor tokens)]
    (if (= (first ts) \*)
      (let [[v2 ts2] (parse-factor (rest ts))]
        (recur [(* v v2) ts2]))
      [v ts])))

(defn parse-expr [tokens]
  (loop [[v ts] (parse-term tokens)]
    (if (= (first ts) \+)
      (let [[v2 ts2] (parse-term (rest ts))]
        (recur [(+ v v2) ts2]))
      [v ts])))

(println (first (parse-expr (tokenize "2+3*4"))))
