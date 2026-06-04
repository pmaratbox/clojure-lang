(defprotocol Shape
  (describe [this]))

(defrecord Circle []
  Shape
  (describe [_] "circle"))

(defrecord Square []
  Shape
  (describe [_] "square"))

(defrecord Triangle []
  Shape
  (describe [_] "triangle"))

(def shapes [(->Circle) (->Square) (->Triangle)])

(println (apply str (interpose " " (map describe shapes))))
