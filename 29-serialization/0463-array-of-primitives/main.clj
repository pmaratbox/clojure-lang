(require '[cheshire.core :as json])

(def numbers [1 2 3])

(println (json/generate-string numbers))
