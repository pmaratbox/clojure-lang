;; Linear congruential generator: next = (5*x + 3) mod 16, seeded at 1.
(defn lcg-next [x] (mod (+ (* 5 x) 3) 16))

(let [outs (take 3 (rest (iterate lcg-next 1)))]
  (println (apply str (interpose " " outs))))
