(def instance (delay (atom {})))

(defn get-instance [] @instance)

(let [a (get-instance)
      b (get-instance)]
  (println (str "same: " (if (identical? a b) "yes" "no"))))
