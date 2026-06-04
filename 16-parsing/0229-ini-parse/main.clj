(def ini "[s]\nk=v")

(defn parse-ini [text]
  (loop [lines (seq (.split text "\n")) section nil out []]
    (if-let [line (first lines)]
      (cond
        (re-matches #"\[.*\]" line)
        (recur (rest lines) (subs line 1 (dec (count line))) out)
        (re-find #"=" line)
        (let [i (.indexOf line "=")
              k (subs line 0 i)
              v (subs line (inc i))]
          (recur (rest lines) section (conj out (str section "." k "=" v))))
        :else (recur (rest lines) section out))
      out)))

(println (apply str (parse-ini ini)))
