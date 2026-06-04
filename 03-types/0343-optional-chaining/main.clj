(defn deep [m]
  (or (get-in m [:a :b :c]) 0))

(println (deep {:a {:b {:c 5}}}) (deep {:a {:b {}}}))
