(require '[clojure.java.io :as io])

(let [f "lines.txt"]
  (spit f "one\ntwo\nthree\n")
  (let [lines (->> (slurp f)
                   (re-seq #"[^\n]+"))]
    (io/delete-file f)
    (println (str "lines: " (count lines)))))
