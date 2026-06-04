(defn rabin-karp [^String text ^String pat]
  (let [n (count text) m (count pat)
        base 256 q 1000000007
        pw (reduce (fn [a _] (mod (* a base) q)) 1 (range (dec m)))
        h (fn [s from] (reduce (fn [acc i]
                                 (mod (+ (* acc base) (int (.charAt s (+ from i)))) q))
                               0 (range m)))
        ph (h pat 0)]
    (loop [i 0 wh (h text 0) acc []]
      (if (> i (- n m))
        acc
        (let [match? (and (= wh ph) (= (subs text i (+ i m)) pat))
              acc (if match? (conj acc i) acc)]
          (if (< i (- n m))
            (let [new-wh (mod (+ (* (mod (- wh (* (int (.charAt text i)) pw)) q) base)
                                 (int (.charAt text (+ i m))))
                              q)
                  new-wh (mod (+ new-wh q) q)]
              (recur (inc i) new-wh acc))
            (recur (inc i) wh acc)))))))

(println (apply str (interpose " " (rabin-karp "xabxab" "ab"))))
