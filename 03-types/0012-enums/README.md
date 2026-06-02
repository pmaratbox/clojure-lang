# 0012 — Enums

Define a `Color` enumeration (`:red`, `:green`, `:blue`) and print the position
of `:green` (1) and `:blue` (2). Clojure has no enum type — keywords are the
idiomatic named constants, and an ordered vector of them gives each a position
(here read with `.indexOf`).

## Run

    clojure -M main.clj
