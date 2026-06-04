(defn levenshtein [^String a ^String b]
  (let [m (count a) n (count b)]
    (loop [i 1 prev (vec (range (inc n)))]
      (if (> i m)
        (peek prev)
        (let [cur (loop [j 1 row [i]]
                    (if (> j n)
                      row
                      (let [cost (if (= (.charAt a (dec i)) (.charAt b (dec j))) 0 1)
                            v (min (inc (peek row))
                                   (inc (nth prev j))
                                   (+ (nth prev (dec j)) cost))]
                        (recur (inc j) (conj row v)))))]
          (recur (inc i) cur))))))

(println (levenshtein "kitten" "sitting"))
