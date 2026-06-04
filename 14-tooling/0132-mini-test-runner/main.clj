(def tests
  [["adds"    (fn [] (= (+ 1 1) 2))]
   ["multiplies" (fn [] (= (* 2 3) 6))]
   ["concats" (fn [] (= (str "a" "b") "ab"))]])

(let [results (map (fn [[_ t]] (boolean (t))) tests)
      passed  (count (filter true? results))
      failed  (count (filter false? results))]
  (println (str passed " passed, " failed " failed")))
