(def inputs [1 2 3 4])

(def results
  (->> inputs
       (mapv #(future (* % %)))
       (mapv deref)))

(apply println results)
