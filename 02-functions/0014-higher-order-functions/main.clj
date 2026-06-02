(let [inc #(+ % 1)
      dbl #(* 2 %)
      app (fn [f x] (f x))]
  (println "inc 5 =" (app inc 5))
  (println "double 5 =" (app dbl 5)))
