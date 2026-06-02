(def head (list 1 2 3))

(loop [node (seq head)
       parts []]
  (if node
    (recur (next node) (conj parts (str (first node))))
    (println (clojure.string/join " -> " parts))))
