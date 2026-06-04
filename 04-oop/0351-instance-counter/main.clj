(def instance-count (atom 0))

(defrecord Widget [])

(defn make-widget []
  (swap! instance-count inc)
  (->Widget))

(make-widget)
(make-widget)
(make-widget)

(println @instance-count)
