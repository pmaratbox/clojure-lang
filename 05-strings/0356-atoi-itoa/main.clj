(defn atoi [s]
  (let [neg (= (first s) \-)
        digits (if (or neg (= (first s) \+)) (rest s) (seq s))
        n (reduce (fn [acc ch] (+ (* acc 10) (- (int ch) (int \0)))) 0 digits)]
    (if neg (- n) n)))

(defn itoa [n]
  (if (zero? n)
    "0"
    (let [neg (neg? n)
          m (Math/abs (long n))
          ds (loop [x m acc ()]
               (if (zero? x)
                 acc
                 (recur (quot x 10) (cons (char (+ (int \0) (rem x 10))) acc))))]
      (apply str (if neg (cons \- ds) ds)))))

(def parsed (atoi "-42"))
(println parsed (itoa parsed))
