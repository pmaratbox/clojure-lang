(let [enc (java.util.Base64/getEncoder)]
  (println (.encodeToString enc (.getBytes "hi" "UTF-8"))))
