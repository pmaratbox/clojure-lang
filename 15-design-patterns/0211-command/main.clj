(def counter (atom 0))

(def add-command
  {:execute (fn [] (swap! counter + 5))
   :undo    (fn [] (swap! counter - 5))})

((:execute add-command))
(print @counter)
((:undo add-command))
(println "" @counter)
