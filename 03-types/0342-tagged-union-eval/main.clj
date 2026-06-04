(defn evl [e]
  (case (:tag e)
    :num (:val e)
    :add (+ (evl (:lhs e)) (evl (:rhs e)))))

(println (evl {:tag :add
               :lhs {:tag :num :val 1}
               :rhs {:tag :num :val 2}}))
