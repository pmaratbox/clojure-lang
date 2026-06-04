(def ops {"+" + "-" - "*" * "/" quot})

(defn eval-rpn [tokens]
  (peek
    (reduce (fn [stack tok]
              (if-let [op (ops tok)]
                (let [b (peek stack)
                      a (peek (pop stack))]
                  (conj (pop (pop stack)) (op a b)))
                (conj stack (Long/parseLong tok))))
            '()
            tokens)))

(println (eval-rpn ["3" "4" "+" "5" "*"]))
