(def prototype {:value 1})

(let [clone (assoc prototype :value 2)]
  (println (:value prototype) (:value clone)))
