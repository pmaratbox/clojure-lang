;; Trie built from nested maps; :end marks a complete word.
(defn insert [trie word]
  (assoc-in trie (conj (vec word) :end) true))

(defn search [trie word]
  (boolean (get-in trie (conj (vec word) :end))))

(def t (-> {} (insert "cat") (insert "car")))

(println (str (if (search t "car") "yes" "no")
              " "
              (if (search t "can") "yes" "no")))
