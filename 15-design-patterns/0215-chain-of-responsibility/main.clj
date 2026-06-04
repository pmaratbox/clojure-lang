(defn handler [level nxt]
  (fn [request]
    (if (= request level)
      (println (str "handled by " level))
      (when nxt (nxt request)))))

(let [chain (handler 1 (handler 2 (handler 3 nil)))]
  (chain 2))
