(def prec {"+" 1 "-" 1 "*" 2 "/" 2})

(defn shunting-yard [tokens]
  (loop [ts tokens out [] ops '()]
    (if-let [t (first ts)]
      (if-let [p (prec t)]
        (let [[popped rest-ops]
              (split-with #(>= (prec %) p) ops)]
          (recur (rest ts) (into out popped) (conj rest-ops t)))
        (recur (rest ts) (conj out t) ops))
      (into out ops))))

(println (apply str (interpose " " (shunting-yard ["3" "+" "4" "*" "2"]))))
