;; Define a Point record and introspect its field names via the keys of an instance.
(defrecord Point [x y])

(let [p (->Point 1 2)]
  (println (apply str (interpose " " (map name (keys p))))))
