(defn step [state event]
  (case [state event]
    [:locked :coin] :unlocked
    [:unlocked :push] :locked
    [:locked :push] :locked
    state))

(def states (rest (reductions step :locked [:coin :push :push])))

(println (apply str (interpose " " (map name states))))
