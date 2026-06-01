(let [a (future 1)
      b (future 2)]
  (println "sum:" (+ @a @b)))

(shutdown-agents)
