(defn evaluate [node]
  (if (number? node)
    node
    (let [[op a b] node]
      (op (evaluate a) (evaluate b)))))

;; AST for 1+2*3  =>  Add(1, Mul(2,3))
(def ast [+ 1 [* 2 3]])

(println (evaluate ast))
