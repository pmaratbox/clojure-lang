(defn just [x] {:tag :some :val x})
(def nothing {:tag :none})

(defn bind [m f]
  (if (= (:tag m) :some)
    (f (:val m))
    nothing))

(defn show [m]
  (if (= (:tag m) :some) (:val m) "none"))

(def present (-> (just 2)
                 (bind (fn [x] (just (+ x 3))))
                 (bind (fn [x] (just (* x 2))))))

(def absent (-> nothing
                (bind (fn [x] (just (+ x 3))))
                (bind (fn [x] (just (* x 2))))))

(println (show present) (show absent))
