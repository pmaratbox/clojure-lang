(defn boyer-moore [^String text ^String pat]
  (let [n (count text) m (count pat)
        last-idx (reduce (fn [acc i] (assoc acc (.charAt pat i) i))
                         {} (range m))]
    (loop [s 0]
      (if (> s (- n m))
        -1
        (let [j (loop [j (dec m)]
                  (if (and (>= j 0) (= (.charAt pat j) (.charAt text (+ s j))))
                    (recur (dec j))
                    j))]
          (if (< j 0)
            s
            (let [bc (get last-idx (.charAt text (+ s j)) -1)
                  shift (max 1 (- j bc))]
              (recur (+ s shift)))))))))

(println (boyer-moore "zzabc" "abc"))
