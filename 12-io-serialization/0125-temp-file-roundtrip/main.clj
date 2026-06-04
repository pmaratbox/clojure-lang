(require '[clojure.java.io :as io])

(let [f (java.io.File/createTempFile "roundtrip" ".txt")
      data "ok-data"]
  (spit f data)
  (let [back (slurp f)]
    (io/delete-file f)
    (println (str "roundtrip: " (if (= data back) "ok" "fail")))))
