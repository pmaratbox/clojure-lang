(defn make-subject []
  (atom []))

(defn subscribe [subject observer]
  (swap! subject conj observer))

(defn next-value [subject v]
  (doseq [obs @subject]
    (obs v)))

(def subject (make-subject))

(subscribe subject (fn [v] (println (str "obs1: " v))))
(subscribe subject (fn [v] (println (str "obs2: " v))))

(next-value subject 1)
(next-value subject 2)
