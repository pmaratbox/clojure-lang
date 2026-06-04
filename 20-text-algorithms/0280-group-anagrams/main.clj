(defn group-anagrams [words]
  (->> words
       (group-by #(sort %))
       count))

(println (group-anagrams ["eat" "tea" "tan" "ate" "nat"]))
