(def grid [[0 1 0]
           [0 1 0]
           [0 1 0]])

(defn live [r c]
  (if (and (<= 0 r 2) (<= 0 c 2)) (get-in grid [r c]) 0))

(defn neighbors [r c]
  (apply + (for [dr [-1 0 1] dc [-1 0 1]
                 :when (not (and (zero? dr) (zero? dc)))]
             (live (+ r dr) (+ c dc)))))

(defn next-cell [r c]
  (let [n (neighbors r c)]
    (if (= 1 (live r c))
      (if (or (= n 2) (= n 3)) 1 0)
      (if (= n 3) 1 0))))

(doseq [r (range 3)]
  (println (apply str (for [c (range 3)] (if (= 1 (next-cell r c)) \# \.)))))
