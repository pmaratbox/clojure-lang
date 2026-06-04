(defrecord Color [r g b])

(defn from-hex [s]
  (let [hex (subs s 1)
        pair (fn [i] (Integer/parseInt (subs hex i (+ i 2)) 16))]
    (->Color (pair 0) (pair 2) (pair 4))))

(let [c (from-hex "#ff0000")]
  (println (str (:r c) " " (:g c) " " (:b c))))
