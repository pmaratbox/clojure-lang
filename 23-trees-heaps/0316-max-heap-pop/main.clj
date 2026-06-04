(defn sift-down [heap i n]
  (loop [heap heap i i]
    (let [l (inc (* 2 i))
          r (+ 2 (* 2 i))
          largest (if (and (< l n) (> (heap l) (heap i))) l i)
          largest (if (and (< r n) (> (heap r) (heap largest))) r largest)]
      (if (= largest i)
        heap
        (recur (assoc heap i (heap largest) largest (heap i)) largest)))))

(defn build-heap [v]
  (let [n (count v)]
    (loop [heap v i (dec (quot n 2))]
      (if (neg? i)
        heap
        (recur (sift-down heap i n) (dec i))))))

(defn pop-max [heap n]
  (let [top (heap 0)
        heap (assoc heap 0 (heap (dec n)))]
    [top (sift-down heap 0 (dec n))]))

(let [heap (build-heap [3 1 4 1 5])]
  (loop [heap heap n (count heap) acc []]
    (if (= (count acc) 3)
      (println (apply str (interpose " " acc)))
      (let [[top h] (pop-max heap n)]
        (recur h (dec n) (conj acc top))))))
