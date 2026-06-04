(def data (.getBytes "Hi"))

(println (apply str (interpose " " (map #(format "%02x" (bit-and % 0xff)) data))))
