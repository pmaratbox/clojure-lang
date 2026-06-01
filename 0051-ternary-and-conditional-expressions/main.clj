(doseq [n [4 7]]
  (let [label (if (zero? (mod n 2)) "even" "odd")]
    (println (str n ": " label))))
