(def transitions {:red :green :green :yellow :yellow :red})

(def states (take 4 (rest (iterate transitions :red))))

(println (apply str (interpose " " (map name states))))
