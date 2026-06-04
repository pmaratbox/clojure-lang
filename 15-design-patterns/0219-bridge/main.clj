(defn red-color [] "red")

(defn circle [color]
  {:describe (fn [] (str (color) " circle"))})

(let [shape (circle red-color)]
  (println ((:describe shape))))
