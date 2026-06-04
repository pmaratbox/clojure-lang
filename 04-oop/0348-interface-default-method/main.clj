(defprotocol Greeter
  (greet [this]))

;; default implementation provided via a base map
(def default-greeter
  (reify Greeter
    (greet [_] "hi")))

;; an implementer that overrides greet
(defrecord Friendly []
  Greeter
  (greet [_] "hey"))

(println (str (greet default-greeter) " " (greet (->Friendly))))
