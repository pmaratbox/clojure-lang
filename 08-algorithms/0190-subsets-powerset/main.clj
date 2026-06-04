(def items [1 2 3])

(doseq [mask (range (bit-shift-left 1 (count items)))]
  (let [subset (for [i (range (count items))
                     :when (bit-test mask i)]
                 (items i))]
    (println (if (empty? subset)
               "{}"
               (clojure.string/join " " subset)))))
