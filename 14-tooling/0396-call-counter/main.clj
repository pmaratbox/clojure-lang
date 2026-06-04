(defn counting [f]
  (let [calls (atom 0)]
    [(fn [& args] (swap! calls inc) (apply f args)) calls]))

(let [[wrapped calls] (counting (fn [] nil))]
  (dotimes [_ 5] (wrapped))
  (println (str "calls: " @calls)))
