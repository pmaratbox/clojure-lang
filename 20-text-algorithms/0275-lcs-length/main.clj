(defn lcs-length [^String a ^String b]
  (let [m (count a) n (count b)]
    (loop [i 1 prev (vec (repeat (inc n) 0))]
      (if (> i m)
        (peek prev)
        (let [cur (loop [j 1 row [0]]
                    (if (> j n)
                      row
                      (let [v (if (= (.charAt a (dec i)) (.charAt b (dec j)))
                                (inc (nth prev (dec j)))
                                (max (nth prev j) (peek row)))]
                        (recur (inc j) (conj row v)))))]
          (recur (inc i) cur))))))

(println (lcs-length "ABCBDAB" "BDCAB"))
