(def state (atom 1))

(def memento @state)
(reset! state 2)
(print @state)
(reset! state memento)
(println "" @state)
