(def tree {:val "root"
           :left {:val "A"
                  :left {:val "C"}
                  :right {:val "D"}}
           :right {:val "B"}})

(def best (atom 0))

(defn height [node]
  (if (nil? node)
    0
    (let [lh (height (:left node))
          rh (height (:right node))]
      (swap! best max (+ lh rh))
      (inc (max lh rh)))))

(height tree)

(println @best)
