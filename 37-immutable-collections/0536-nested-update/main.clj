(def original {:user {:age 30}})

;; assoc-in returns a NEW persistent map with the nested value updated;
;; the original map is left unchanged.
(def updated (assoc-in original [:user :age] 31))

(println (get-in updated [:user :age]))
(println (get-in original [:user :age]))
