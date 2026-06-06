(def emitter (atom {}))

(defn on [topic handler]
  (swap! emitter update topic (fnil conj []) handler))

(defn off [topic handler]
  (swap! emitter update topic (fn [hs] (vec (remove #(= % handler) hs)))))

(defn emit [topic payload]
  (doseq [h (get @emitter topic)]
    (h payload)))

(defn h [payload] (println (str "hi " payload)))
(defn g [payload] (println (str "bye " payload)))

(on "greet" h)
(on "bye" g)

(emit "greet" "ada")
(emit "bye" "ada")

(off "greet" h)
(emit "greet" "x")
