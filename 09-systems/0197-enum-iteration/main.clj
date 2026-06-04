;; Model the Color enum as an ordered vector of keyword values.
(def colors [:RED :GREEN :BLUE])

(println (apply str (interpose " " (map name colors))))
