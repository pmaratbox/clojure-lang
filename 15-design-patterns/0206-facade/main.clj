(defn sub1-init [] nil)
(defn sub2-init [] nil)
(defn sub3-init [] nil)

(defn start []
  (sub1-init)
  (sub2-init)
  (sub3-init)
  "ready")

(println (start))
