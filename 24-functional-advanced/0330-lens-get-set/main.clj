(defn lens [getter setter]
  {:get getter :set setter})

(def b-lens
  (lens (fn [s] (get-in s [:a :b]))
        (fn [s v] (assoc-in s [:a :b] v))))

(def data {:a {:b 1}})

(println ((:get b-lens) data)
         (get-in ((:set b-lens) data 2) [:a :b]))
