(defn insert [trie word]
  (assoc-in trie (concat word [:end]) true))

(defn collect [node prefix]
  (let [here (if (:end node) [prefix] [])]
    (->> (sort (keys (dissoc node :end)))
         (mapcat #(collect (get node %) (str prefix %)))
         (into here))))

(defn autocomplete [trie prefix]
  (let [node (get-in trie (seq prefix))]
    (if node (collect node prefix) [])))

(let [trie (reduce insert {} ["car" "card" "dog"])]
  (println (apply str (interpose " " (autocomplete trie "car")))))
