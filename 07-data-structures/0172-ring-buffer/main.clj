;; Fixed capacity-3 ring buffer backed by an atom holding a vector + head index.
(def cap 3)
(def buf (atom {:data (vec (repeat cap nil)) :head 0 :count 0}))

(defn push! [x]
  (swap! buf
         (fn [{:keys [data head count]}]
           {:data (assoc data head x)
            :head (mod (inc head) cap)
            :count (min cap (inc count))})))

(doseq [x [1 2 3 4 5]] (push! x))

(let [{:keys [data head count]} @buf
      start (mod (- head count) cap)
      ordered (mapv #(data (mod (+ start %) cap)) (range count))]
  (println (apply str (interpose " " ordered))))
