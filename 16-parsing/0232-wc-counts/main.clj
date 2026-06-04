(def text "a b\nc")

(let [words (count (remove empty? (.split text "\\s+")))
      lines (inc (count (filter #(= % \newline) text)))
      chars (count text)]
  (println (str words " " lines " " chars)))
