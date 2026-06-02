(require '[clojure.string :as str])

(let [name "world"]
  (println (str "Hello, " name "!"))
  (println (str/upper-case name))
  (println "length:" (count name)))
