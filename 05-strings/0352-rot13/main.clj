(defn rot13 [s]
  (apply str (map (fn [ch]
                    (let [c (int ch)]
                      (cond
                        (<= (int \a) c (int \z)) (char (+ (mod (+ (- c (int \a)) 13) 26) (int \a)))
                        (<= (int \A) c (int \Z)) (char (+ (mod (+ (- c (int \A)) 13) 26) (int \A)))
                        :else ch)))
                  s)))

(def encoded (rot13 "hello"))
(def decoded (rot13 encoded))
(println encoded decoded)
