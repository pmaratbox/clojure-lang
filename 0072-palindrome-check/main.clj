(doseq [word ["level" "hello"]]
  (let [pal (= word (clojure.string/reverse word))]
    (println (str word ": " (if pal "yes" "no")))))
