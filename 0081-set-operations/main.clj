(require 'clojure.set)

(def a #{1 2 3})
(def b #{2 3 4})
(println (clojure.string/join " " (sort (clojure.set/union a b))))
(println (clojure.string/join " " (sort (clojure.set/intersection a b))))
