(defn add-strings [a b]
  (loop [da (reverse a)
         db (reverse b)
         carry 0
         acc ()]
    (if (and (empty? da) (empty? db) (zero? carry))
      (apply str acc)
      (let [x (if (seq da) (- (int (first da)) 48) 0)
            y (if (seq db) (- (int (first db)) 48) 0)
            s (+ x y carry)]
        (recur (rest da) (rest db) (quot s 10)
               (conj acc (char (+ 48 (rem s 10)))))))))

(println (add-strings "999999999999" "1"))
