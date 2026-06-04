(defn observer [id]
  (fn [value] (println (str id ": " value))))

(let [observers [(observer "obs1") (observer "obs2")]
      notify (fn [value] (doseq [o observers] (o value)))]
  (notify 5))
