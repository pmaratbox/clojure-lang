(let [bytes (.getBytes "Hi" "UTF-8")]
  (println (apply str (interpose " " (map #(bit-and % 0xff) bytes)))))
