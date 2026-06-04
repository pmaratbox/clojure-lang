(require '[clojure.java.io :as io])

(let [f "data.txt"]
  (spit f "a\n")
  (spit f "b\n" :append true)
  (let [lines (re-seq #"[^\n]+" (slurp f))]
    (io/delete-file f)
    (println (apply str (interpose " " lines)))))
