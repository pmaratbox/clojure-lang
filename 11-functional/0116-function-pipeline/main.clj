(def double-it #(* 2 %))
(def pipe (comp - double-it inc))

(println (pipe 3))
