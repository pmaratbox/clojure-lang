(defn perfect? [n]
  (= n (apply + (filter #(zero? (mod n %)) (range 1 n)))))

(println (str (if (perfect? 6) "yes" "no")
              " "
              (if (perfect? 8) "yes" "no")))
