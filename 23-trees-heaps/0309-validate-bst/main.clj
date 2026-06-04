(defn valid? [node low high]
  (or (nil? node)
      (let [v (:val node)]
        (and (or (nil? low) (> v low))
             (or (nil? high) (< v high))
             (valid? (:left node) low v)
             (valid? (:right node) v high)))))

(def good {:val 5
           :left {:val 3 :left {:val 1} :right {:val 4}}
           :right {:val 8}})

(def bad {:val 5
          :left {:val 3 :left {:val 1} :right {:val 6}}
          :right {:val 8}})

(println (if (valid? good nil nil) "yes" "no")
         (if (valid? bad nil nil) "yes" "no"))
