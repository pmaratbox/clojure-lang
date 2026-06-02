(def nums [1 2 3 4 5 6 7])
(doseq [chunk (partition-all 3 nums)]
  (println (clojure.string/join " " chunk)))
