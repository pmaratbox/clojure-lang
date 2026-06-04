(defn longest-common-substring [^String a ^String b]
  (let [m (count a) n (count b)]
    (loop [i 1 prev (vec (repeat (inc n) 0)) best 0 end 0]
      (if (> i m)
        (subs a (- end best) end)
        (let [[cur best2 end2]
              (loop [j 1 row [0] best best end end]
                (if (> j n)
                  [row best end]
                  (if (= (.charAt a (dec i)) (.charAt b (dec j)))
                    (let [v (inc (nth prev (dec j)))]
                      (if (> v best)
                        (recur (inc j) (conj row v) v i)
                        (recur (inc j) (conj row v) best end)))
                    (recur (inc j) (conj row 0) best end))))]
          (recur (inc i) cur best2 end2))))))

(println (longest-common-substring "abcde" "xbcdy"))
