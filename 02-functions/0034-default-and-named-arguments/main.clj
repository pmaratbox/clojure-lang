(defn greet
  ([name] (greet name "Hello"))
  ([name greeting] (str greeting ", " name)))

(println (greet "Ada"))
(println (greet "Ada" "Hi"))
