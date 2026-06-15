(require '[clojure.set :as set])

;; Two immutable (persistent) sets.
(def a #{1 2 3})
(def b #{3 4 5})

;; clojure.set/union RETURNS A NEW set; a and b are unchanged.
(def u (set/union a b))

;; Print the union's elements, sorted for determinism, space-joined.
(println (clojure.string/join " " (sort u)))
