(defn divisible-by-3? [bits]
  (zero? (reduce (fn [s b] (mod (+ (* s 2) b) 3)) 0 bits)))

(defn bits [s] (map #(- (int %) (int \0)) s))

(println (apply str (interpose " " (map #(if (divisible-by-3? (bits %)) "yes" "no")
                                        ["110" "100"]))))
