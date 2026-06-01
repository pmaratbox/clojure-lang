(require '[clojure.string :as str])

(loop [stack (reduce conj '() [1 2 3])
       popped []]
  (if (empty? stack)
    (println (str/join " " popped))
    (recur (pop stack) (conj popped (peek stack)))))
