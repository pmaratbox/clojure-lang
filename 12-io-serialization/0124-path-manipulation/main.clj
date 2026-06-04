(let [p (java.nio.file.Paths/get "/tmp" (into-array String ["file.txt"]))
      full (str p)
      base (str (.getFileName p))
      ext (subs base (.lastIndexOf base "."))]
  (println (str full " " base " " ext)))
