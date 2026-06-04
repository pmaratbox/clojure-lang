;; Array-backed binary min-heap with manual sift-up / sift-down.
(defn sift-up [h]
  (loop [h h i (dec (count h))]
    (if (zero? i)
      h
      (let [p (quot (dec i) 2)]
        (if (< (h i) (h p))
          (recur (assoc h i (h p) p (h i)) p)
          h)))))

(defn sift-down [h]
  (let [n (count h)]
    (loop [h h i 0]
      (let [l (+ (* 2 i) 1)
            r (+ (* 2 i) 2)
            s (if (and (< l n) (< (h l) (h i))) l i)
            small (if (and (< r n) (< (h r) (h s))) r s)]
        (if (= small i)
          h
          (recur (assoc h i (h small) small (h i)) small))))))

(defn push [h x] (sift-up (conj h x)))

(defn pop-min [h]
  (let [top (h 0)
        last (peek h)
        h (pop h)]
    (if (empty? h)
      [top h]
      [top (sift-down (assoc h 0 last))])))

(let [h (reduce push [] [3 1 2])]
  (loop [h h acc []]
    (if (empty? h)
      (println (apply str (interpose " " acc)))
      (let [[m h] (pop-min h)]
        (recur h (conj acc m))))))
