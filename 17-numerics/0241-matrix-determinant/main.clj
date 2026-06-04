(defn det2 [[[a b] [c d]]]
  (- (* a d) (* b c)))

(println (det2 [[1 2] [3 4]]))
