;; BehaviorSubject: holds a current value and replays it to each new subscriber.

(defn behavior-subject [init]
  (let [current (atom init)
        observers (atom [])]
    {:subscribe (fn [observer]
                  (observer @current)            ; replay current value immediately
                  (swap! observers conj observer))
     :next (fn [v]
             (reset! current v)
             (doseq [o @observers] (o v)))}))

(let [subj (behavior-subject 0)
      a (fn [v] (println (str "A: " v)))
      b (fn [v] (println (str "B: " v)))]
  ((:subscribe subj) a)   ; A: 0
  ((:next subj) 1)        ; A: 1
  ((:subscribe subj) b)   ; B: 1
  ((:next subj) 2))       ; A: 2, B: 2
