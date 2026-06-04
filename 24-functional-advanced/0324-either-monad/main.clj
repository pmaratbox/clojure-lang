(defn right [x] {:tag :right :val x})
(defn left [x] {:tag :left :val x})

(defn bind [m f]
  (if (= (:tag m) :right)
    (f (:val m))
    m))

(defn safe-div [a b]
  (if (zero? b) (left "err") (right (/ a b))))

(def ok (-> (right 8)
            (bind (fn [x] (safe-div x 2)))   ; 4
            (bind (fn [x] (safe-div x 2)))))  ; 2

(def bad (-> (right 8)
             (bind (fn [x] (safe-div x 0)))
             (bind (fn [x] (safe-div x 2)))))

(defn show [m]
  (if (= (:tag m) :right) (:val m) (:val m)))

(println (show ok) (show bad))
