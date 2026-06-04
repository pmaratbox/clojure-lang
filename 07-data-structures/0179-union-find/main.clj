;; Disjoint-set (union-find) over a map of parent links.
(defn find-root [parent x]
  (if (= (parent x) x)
    x
    (recur parent (parent x))))

(defn union [parent a b]
  (assoc parent (find-root parent a) (find-root parent b)))

(defn connected? [parent a b]
  (= (find-root parent a) (find-root parent b)))

(let [parent (zipmap (range 4) (range 4))
      parent (-> parent (union 0 1) (union 2 3))]
  (println (str (if (connected? parent 0 1) "yes" "no")
                " "
                (if (connected? parent 0 2) "yes" "no"))))
