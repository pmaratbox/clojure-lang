(def size 3)
(def goal [2 2])

(defn h [[r c]] (+ (Math/abs (- r (goal 0))) (Math/abs (- c (goal 1)))))

(defn neighbors [[r c]]
  (for [[dr dc] [[1 0] [-1 0] [0 1] [0 -1]]
        :let [nr (+ r dr) nc (+ c dc)]
        :when (and (<= 0 nr (dec size)) (<= 0 nc (dec size)))]
    [nr nc]))

(defn astar []
  (loop [open {[0 0] 0}
         g {[0 0] 0}]
    (if (empty? open)
      nil
      (let [cur (apply min-key #(+ (g %) (h %)) (keys open))]
        (if (= cur goal)
          (g cur)
          (let [open (dissoc open cur)
                [open g] (reduce (fn [[o gm] nb]
                                   (let [ng (inc (g cur))]
                                     (if (< ng (get gm nb Long/MAX_VALUE))
                                       [(assoc o nb ng) (assoc gm nb ng)]
                                       [o gm])))
                                 [open g] (neighbors cur))]
            (recur open g)))))))

(println (astar))
