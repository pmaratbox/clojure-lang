(def text "aab")

(def freqs
  (reduce (fn [acc ch]
            (let [k (str ch)]
              (if (contains? acc k)
                (update acc k inc)
                (assoc acc k 1))))
          (array-map)
          text))

(println (apply str (interpose " " (map (fn [[k v]] (str k ":" v)) freqs))))
