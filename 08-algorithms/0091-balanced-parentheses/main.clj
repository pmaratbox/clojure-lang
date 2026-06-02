(defn balanced? [s]
  (loop [chars (seq s)
         stack []]
    (if (empty? chars)
      (empty? stack)
      (let [ch (first chars)]
        (cond
          (= ch \() (recur (rest chars) (conj stack ch))
          (= ch \)) (if (empty? stack) false (recur (rest chars) (pop stack)))
          :else (recur (rest chars) stack))))))

(doseq [s ["(())" "(()"]]
  (println (if (balanced? s) "yes" "no")))
