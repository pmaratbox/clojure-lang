(defn mfold [identity combine xs]
  (reduce combine identity xs))

(println (mfold "" str ["a" "b" "c"]) (mfold 0 + [1 2 3]))
