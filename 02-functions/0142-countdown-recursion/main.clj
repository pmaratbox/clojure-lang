(defn countdown [n]
  (when (pos? n)
    (cons n (countdown (dec n)))))

(println (apply str (interpose " " (countdown 5))))
