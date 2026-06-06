;; Cold vs Hot Observable
;; A cold observable re-runs its producer for each subscriber.
;; A hot observable shares one execution; late subscribers miss earlier values.

;; --- Cold observable -------------------------------------------------------
;; subscribe runs the producer independently for each observer.
(defn cold-observable [producer]
  (fn [observer] (producer observer)))

(defn cold-numbers [observer]
  (doseq [v [1 2 3]]
    (observer v)))

;; --- Hot observable --------------------------------------------------------
;; one shared producer pushing to a set of current observers.
(defn hot-observable []
  (let [observers (atom [])]
    {:subscribe (fn [observer] (swap! observers conj observer))
     :emit      (fn [v] (doseq [o @observers] (o v)))}))

;; --- Cold run --------------------------------------------------------------
(let [src     (cold-observable cold-numbers)
      cold-a  (atom [])
      cold-b  (atom [])
      join    (fn [xs] (apply str (interpose " " xs)))]
  (src (fn [v] (swap! cold-a conj v)))
  (src (fn [v] (swap! cold-b conj v)))
  (println (str "cold A: " (join @cold-a)))
  (println (str "cold B: " (join @cold-b))))

;; --- Hot run ---------------------------------------------------------------
(let [hot    (hot-observable)
      hot-a  (atom [])
      hot-b  (atom [])
      join   (fn [xs] (apply str (interpose " " xs)))]
  ((:subscribe hot) (fn [v] (swap! hot-a conj v)))
  ((:emit hot) 1)
  ((:subscribe hot) (fn [v] (swap! hot-b conj v)))
  ((:emit hot) 2)
  ((:emit hot) 3)
  (println (str "hot A: " (join @hot-a)))
  (println (str "hot B: " (join @hot-b))))
