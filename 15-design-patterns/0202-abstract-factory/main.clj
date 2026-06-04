(defn theme-factory [theme]
  {:button   {:label (str theme "-button")}
   :checkbox {:label (str theme "-checkbox")}})

(let [f (theme-factory "dark")]
  (println (get-in f [:button :label]) (get-in f [:checkbox :label])))
