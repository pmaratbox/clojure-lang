(def nums [2 7 11 15])
(def target 9)

(loop [i 0
       seen {}]
  (let [n (nums i)
        need (- target n)]
    (if (contains? seen need)
      (println (str (seen need) " " i))
      (recur (inc i) (assoc seen n i)))))
