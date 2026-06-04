(defn expand [^String s l r]
  (loop [l l r r]
    (if (and (>= l 0) (< r (count s)) (= (.charAt s l) (.charAt s r)))
      (recur (dec l) (inc r))
      [(inc l) (dec r)])))

(defn longest-palindrome [^String s]
  (loop [c 0 best-l 0 best-r 0]
    (if (>= c (count s))
      (subs s best-l (inc best-r))
      (let [[l1 r1] (expand s c c)
            [l2 r2] (expand s c (inc c))
            [bl br] (if (> (- r1 l1) (- best-r best-l)) [l1 r1] [best-l best-r])
            [bl br] (if (> (- r2 l2) (- br bl)) [l2 r2] [bl br])]
        (recur (inc c) bl br)))))

(println (longest-palindrome "babad"))
