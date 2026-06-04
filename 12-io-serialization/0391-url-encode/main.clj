(defn unreserved? [c]
  (or (Character/isLetterOrDigit c)
      (#{\- \_ \. \~} c)))

(defn encode-char [c]
  (if (unreserved? c)
    (str c)
    (format "%%%02X" (int c))))

(def encoded (apply str (map encode-char "a b&c")))

(println encoded)
