(def nums [1 3 5 7 9])
(def target 7)

(loop [lo 0
       hi (dec (count nums))]
  (if (<= lo hi)
    (let [mid (quot (+ lo hi) 2)
          v (nums mid)]
      (cond
        (= v target) (println (str "found " target " at index " mid))
        (< v target) (recur (inc mid) hi)
        :else (recur lo (dec mid))))
    (println (str "found " target " at index -1"))))
