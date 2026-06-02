(defn anagram? [a b]
  (= (sort a) (sort b)))

(doseq [[a b] [["listen" "silent"] ["hello" "world"]]]
  (println (str a "/" b ": " (if (anagram? a b) "yes" "no"))))
