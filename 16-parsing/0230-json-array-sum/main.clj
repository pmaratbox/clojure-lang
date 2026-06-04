(defn parse-array-sum [s]
  (let [inner (subs s 1 (dec (count s)))]
    (->> (.split inner ",")
         (map #(Long/parseLong (.trim %)))
         (reduce +))))

(println (parse-array-sum "[1,2,3]"))
