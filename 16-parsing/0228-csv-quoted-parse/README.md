# 0228 — Parse Quoted CSV

Parse the CSV row `a,"b,c",d`, respecting the quoted comma, into three fields joined by pipes `a|b,c|d`. Clojure walks the chars in `loop`/`recur` tracking an in-quotes flag.

## Run

    clojure -M main.clj
