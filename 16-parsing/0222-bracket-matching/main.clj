(def pairs {\) \(, \] \[, \} \{})
(def opens #{\( \[ \{})

(defn balanced? [s]
  (loop [cs (seq s) stack '()]
    (if-let [c (first cs)]
      (cond
        (opens c) (recur (rest cs) (conj stack c))
        (contains? pairs c) (if (= (peek stack) (pairs c))
                              (recur (rest cs) (pop stack))
                              false)
        :else (recur (rest cs) stack))
      (empty? stack))))

(println (str (if (balanced? "([{}])") "yes" "no")
              " "
              (if (balanced? "([)]") "yes" "no")))
