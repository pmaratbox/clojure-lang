(def mask 5)

(def submasks
  (loop [sub mask
         acc []]
    (let [acc (conj acc sub)]
      (if (zero? sub)
        acc
        (recur (bit-and (dec sub) mask) acc)))))

(apply println submasks)
