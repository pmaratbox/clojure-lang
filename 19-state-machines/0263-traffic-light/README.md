# 0263 — Traffic Light FSM

Starting at red, advance a traffic light through four transitions (red->green->yellow->red->green), printing each new state `green yellow red green`. A transition map plus `iterate` drives the FSM idiomatically.

## Run

    clojure -M main.clj
