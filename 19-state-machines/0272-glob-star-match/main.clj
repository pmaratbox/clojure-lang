(defn glob-match? [pat txt]
  (cond
    (empty? pat) (empty? txt)
    (= \* (first pat)) (or (glob-match? (rest pat) txt)
                           (and (seq txt) (glob-match? pat (rest txt))))
    (and (seq txt) (= (first pat) (first txt))) (glob-match? (rest pat) (rest txt))
    :else false))

(println (apply str (interpose " " (map #(if (glob-match? "a*b" %) "yes" "no")
                                        ["aaab" "aac"]))))
