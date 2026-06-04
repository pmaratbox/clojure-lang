(defn prime? [n]
  (and (> n 1)
       (not-any? #(zero? (mod n %))
                 (range 2 (inc (long (Math/sqrt n)))))))

(println (clojure.string/join " " (map #(if (prime? %) "yes" "no") [7 9])))
