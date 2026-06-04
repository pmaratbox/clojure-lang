(def strategies {"add" + "mul" *})

(let [add (strategies "add")
      mul (strategies "mul")]
  (println (add 3 4) (mul 3 4)))
