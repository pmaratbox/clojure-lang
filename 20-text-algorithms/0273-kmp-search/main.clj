(defn prefix-fn [^String p]
  (let [n (count p)
        pi (int-array n)]
    (loop [i 1 k 0]
      (if (>= i n)
        (vec pi)
        (let [k2 (loop [k k]
                   (if (and (pos? k) (not= (.charAt p i) (.charAt p k)))
                     (recur (aget pi (dec k)))
                     k))
              k3 (if (= (.charAt p i) (.charAt p k2)) (inc k2) k2)]
          (aset pi i k3)
          (recur (inc i) k3))))))

(defn kmp [^String text ^String pat]
  (let [pi (prefix-fn pat)
        m (count pat)
        n (count text)]
    (loop [i 0 k 0 acc []]
      (if (>= i n)
        acc
        (let [k2 (loop [k k]
                   (if (and (pos? k) (not= (.charAt text i) (.charAt pat k)))
                     (recur (nth pi (dec k)))
                     k))
              k3 (if (= (.charAt text i) (.charAt pat k2)) (inc k2) k2)]
          (if (= k3 m)
            (recur (inc i) (nth pi (dec k3)) (conj acc (- (inc i) m)))
            (recur (inc i) k3 acc)))))))

(println (apply str (interpose " " (kmp "ababab" "ab"))))
