;; ReplaySubject: buffers the last N values and replays them to a late subscriber.

(defn replay-subject [buffer-size]
  (let [buffer (atom [])
        observers (atom [])]
    {:subscribe (fn [observer]
                  (doseq [v @buffer] (observer v)) ; replay buffered values immediately
                  (swap! observers conj observer))
     :next (fn [v]
             (swap! buffer (fn [b] (vec (take-last buffer-size (conj b v)))))
             (doseq [o @observers] (o v)))}))

(let [subj (replay-subject 2)
      late (fn [v] (println v))]
  ((:next subj) 1)        ; buffer [1]
  ((:next subj) 2)        ; buffer [1 2]
  ((:next subj) 3)        ; buffer [2 3]
  ((:subscribe subj) late) ; prints 2, 3
  ((:next subj) 4))        ; prints 4
