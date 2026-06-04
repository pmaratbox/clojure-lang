;; Capacity-2 LRU cache: a map for values plus a recency vector, both in an atom.
(def cap 2)
(def cache (atom {:vals {} :order []}))

(defn touch [order k]
  (conj (vec (remove #(= % k) order)) k))

(defn put! [k v]
  (swap! cache
         (fn [{:keys [vals order]}]
           (let [order (touch order k)
                 vals (assoc vals k v)]
             (if (> (count order) cap)
               (let [evict (first order)]
                 {:vals (dissoc vals evict) :order (vec (rest order))})
               {:vals vals :order order})))))

(defn get! [k]
  (let [{:keys [vals]} @cache]
    (if (contains? vals k)
      (let [v (vals k)]
        (swap! cache update :order touch k)
        v)
      -1)))

(put! 1 1)
(put! 2 2)
(get! 1)
(put! 3 3)
(println (str (get! 1) " " (get! 2)))
