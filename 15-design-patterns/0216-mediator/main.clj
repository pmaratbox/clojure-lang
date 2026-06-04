(defn receive [id msg]
  (println (str id " got: " msg)))

(defn mediator [from msg]
  (when (= from "A")
    (receive "B" msg)))

(defn send-msg [from msg]
  (mediator from msg))

(send-msg "A" "hi")
