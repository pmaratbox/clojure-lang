(defn lower-bound [v x]
  (loop [lo 0 hi (count v)]
    (if (< lo hi)
      (let [mid (quot (+ lo hi) 2)]
        (if (< (v mid) x)
          (recur (inc mid) hi)
          (recur lo mid)))
      lo)))

(defn upper-bound [v x]
  (loop [lo 0 hi (count v)]
    (if (< lo hi)
      (let [mid (quot (+ lo hi) 2)]
        (if (<= (v mid) x)
          (recur (inc mid) hi)
          (recur lo mid)))
      lo)))

(let [v [1 3 5 5 7]]
  (println (str (lower-bound v 5) " " (upper-bound v 5))))
