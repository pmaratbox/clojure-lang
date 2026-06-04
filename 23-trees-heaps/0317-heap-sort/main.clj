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

(defn heap-sort [v]
  (let [n (count v)]
    (loop [heap (build-heap v) end (dec n)]
      (if (zero? end)
        heap
        (let [heap (assoc heap 0 (heap end) end (heap 0))]
          (recur (sift-down heap 0 end) (dec end)))))))

(println (apply str (interpose " " (heap-sort [5 3 8 1 4]))))
