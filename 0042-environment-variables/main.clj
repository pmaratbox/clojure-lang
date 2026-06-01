(def value (or (System/getenv "LESSON_ENV_VAR") "default"))

(println (str "value: " value))
