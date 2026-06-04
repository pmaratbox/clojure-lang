;; Capacity-3 circular queue: fixed vector with head/tail indices wrapping with mod.
(def cap 3)
(def q (atom {:data (vec (repeat cap nil)) :head 0 :count 0}))

(defn enqueue! [x]
  (swap! q
         (fn [{:keys [data head count]}]
           (let [tail (mod (+ head count) cap)]
             {:data (assoc data tail x)
              :head head
              :count (inc count)}))))

(defn dequeue! []
  (let [{:keys [data head count]} @q
        v (data head)]
    (swap! q assoc :head (mod (inc head) cap) :count (dec count))
    v))

(enqueue! 1)
(enqueue! 2)
(enqueue! 3)
(dequeue!)
(enqueue! 4)

(let [{:keys [data head count]} @q
      ordered (mapv #(data (mod (+ head %) cap)) (range count))]
  (println (apply str (interpose " " ordered))))
