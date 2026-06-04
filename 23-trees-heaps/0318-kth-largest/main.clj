(def k 2)

;; Maintain a min-heap of size k as a sorted vector; smallest at index 0.
(defn offer [heap x]
  (let [heap (vec (sort (conj heap x)))]
    (if (> (count heap) k)
      (subvec heap 1)
      heap)))

(def result (reduce offer [] [3 2 1 5 6 4]))

;; Root of the size-k min-heap is the kth largest.
(println (first result))
