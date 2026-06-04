(defn cmul [[ar ai] [br bi]]
  [(- (* ar br) (* ai bi))
   (+ (* ar bi) (* ai br))])

(let [[re im] (cmul [1 2] [3 4])]
  (println (str re " " im)))
