(defn min-window [^String s ^String t]
  (let [need (frequencies t)
        required (count need)
        n (count s)]
    (loop [r 0 l 0 have 0 window {} best nil]
      (if (>= r n)
        (if best (subs s (first best) (second best)) "")
        (let [c (.charAt s r)
              window (update window c (fnil inc 0))
              have (if (and (need c) (= (window c) (need c))) (inc have) have)]
          ;; shrink from left while valid
          (let [[l have window best]
                (loop [l l have have window window best best]
                  (if (= have required)
                    (let [best (if (or (nil? best)
                                       (< (- (inc r) l) (- (second best) (first best))))
                                 [l (inc r)] best)
                          lc (.charAt s l)
                          window2 (update window lc dec)
                          have2 (if (and (need lc) (< (window2 lc) (need lc)))
                                  (dec have) have)]
                      (recur (inc l) have2 window2 best))
                    [l have window best]))]
            (recur (inc r) l have window best)))))))

(println (min-window "ADOBECODEBANC" "ABC"))
