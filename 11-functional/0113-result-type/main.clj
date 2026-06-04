(defn safe-div [a b]
  (if (zero? b)
    [:err "divide by zero"]
    [:ok (quot a b)]))

(defn show [[tag v]]
  (case tag
    :ok (str "ok: " v)
    :err (str "err: " v)))

(println (show (safe-div 10 2)))
(println (show (safe-div 1 0)))
