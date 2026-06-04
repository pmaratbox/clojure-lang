(defn parse-csv [row]
  (loop [cs (seq row) in-q false cur "" fields []]
    (if-let [c (first cs)]
      (cond
        (= c \") (recur (rest cs) (not in-q) cur fields)
        (and (= c \,) (not in-q)) (recur (rest cs) in-q "" (conj fields cur))
        :else (recur (rest cs) in-q (str cur c) fields))
      (conj fields cur))))

(println (apply str (interpose "|" (parse-csv "a,\"b,c\",d"))))
