;; Stack tracking its minimum in O(1) via a parallel min-stack.
(defn push [{:keys [data mins]} x]
  {:data (conj data x)
   :mins (conj mins (if (empty? mins) x (min x (peek mins))))})

(defn get-min [{:keys [mins]}] (peek mins))

(let [s (reduce push {:data [] :mins []} [3 1 2])]
  (println (str "min: " (get-min s))))
