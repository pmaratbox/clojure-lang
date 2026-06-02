(def text "abc")
(def shift 1)
(def result
  (apply str (map (fn [ch]
                    (char (+ (mod (+ (- (int ch) (int \a)) shift) 26) (int \a))))
                  text)))
(println result)
