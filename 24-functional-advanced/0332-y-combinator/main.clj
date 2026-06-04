(defn Y [f]
  ((fn [x] (x x))
   (fn [x] (f (fn [n] ((x x) n))))))

(def fact-gen
  (fn [self]
    (fn [n]
      (if (zero? n) 1 (* n (self (dec n)))))))

(println ((Y fact-gen) 5))
