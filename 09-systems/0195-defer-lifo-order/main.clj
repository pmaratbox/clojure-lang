;; Emulate defer with a stack: actions run in last-in-first-out order.
(let [stack (atom [])]
  (doseq [n [1 2 3]]
    (swap! stack conj n))
  (println (apply str (interpose " " (reverse @stack)))))
