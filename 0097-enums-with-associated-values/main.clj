(defn area [shape]
  (case (:type shape)
    :rect (* (:w shape) (:h shape))
    :square (* (:s shape) (:s shape))))

(def shapes [{:type :rect :w 2 :h 3} {:type :square :s 4}])
(doseq [shape shapes]
  (println (area shape)))
