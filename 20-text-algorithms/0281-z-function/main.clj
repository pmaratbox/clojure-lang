(defn z-function [^String s]
  (let [n (count s)
        z (int-array n)]
    (loop [i 1 l 0 r 0]
      (when (< i n)
        (let [start (if (< i r) (min (- r i) (aget z (- i l))) 0)
              k (loop [k start]
                  (if (and (< (+ i k) n) (= (.charAt s k) (.charAt s (+ i k))))
                    (recur (inc k))
                    k))]
          (aset z i k)
          (if (> (+ i k) r)
            (recur (inc i) i (+ i k))
            (recur (inc i) l r)))))
    (vec z)))

(println (apply str (interpose " " (rest (z-function "aaaa")))))
