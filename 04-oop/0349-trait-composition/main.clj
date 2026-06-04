(defprotocol A
  (do-a [this]))

(defprotocol B
  (do-b [this]))

;; one type composing two capabilities
(defrecord Composed []
  A
  (do-a [_] "a")
  B
  (do-b [_] "b"))

(let [c (->Composed)]
  (println (str (do-a c) " " (do-b c))))
