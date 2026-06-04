# 0260 — Pack and Unpack Bits

Pack r=1,g=2,b=3 into one integer (8 bits each) then unpack them, printing `1 2 3`. `bit-shift-left`/`bit-or` pack the channels and shift-plus-`(bit-and … 0xff)` unpacks them.

## Run

    clojure -M main.clj
