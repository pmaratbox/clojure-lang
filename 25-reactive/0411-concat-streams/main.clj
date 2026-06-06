;; Concat streams: subscribe to the second source only after the first completes.
;; An Observable is a function of an observer map {:next :error :complete}.

(defn observable [subscribe-fn]
  subscribe-fn)

(defn subscribe [obs observer]
  (obs observer))

(defn from-vec [xs]
  (fn [{:keys [next complete]}]
    (doseq [x xs] (next x))
    (complete)))

(defn concat-streams [a b]
  (fn [{:keys [next error complete]}]
    (subscribe a {:next next
                  :error error
                  :complete (fn []
                              (subscribe b {:next next
                                            :error error
                                            :complete complete}))})))

(def stream (concat-streams (from-vec [1 2]) (from-vec [3 4])))

(subscribe stream {:next     println
                   :error    (fn [e] (println "error" e))
                   :complete (fn [])})
