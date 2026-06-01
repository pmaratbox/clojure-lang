(def word "banana")
(def counts (frequencies word))

(println (clojure.string/join " "
                              (map (fn [ch] (str ch ":" (counts ch)))
                                   (sort (keys counts)))))
