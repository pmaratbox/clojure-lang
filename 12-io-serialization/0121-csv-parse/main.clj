(def csv "alice,30\nbob,25")

(let [pairs (for [row (re-seq #"[^\n]+" csv)
                  :let [[name value] (re-seq #"[^,]+" row)]]
              (str name "=" value))]
  (println (apply str (interpose " " pairs))))
