(defn make-account [initial]
  (atom initial))

(defn deposit [account amount]
  (swap! account + amount))

(defn balance [account]
  @account)

(let [acc (make-account 100)]
  (deposit acc 50)
  (println (balance acc)))
