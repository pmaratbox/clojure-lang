(def nums [1 2 3 4])
(doseq [w (partition 2 1 nums)]
  (println (clojure.string/join " " w)))
