# 0154 — Polymorphic Area

Sum the areas of a Rectangle(2,3)=6 and a Triangle(base=4,height=4)=8 through a common Shape interface, printing `total area: 14`. A `defprotocol` defines the polymorphic `area`, and each `defrecord` supplies its own implementation.

## Run

    clojure -M main.clj
