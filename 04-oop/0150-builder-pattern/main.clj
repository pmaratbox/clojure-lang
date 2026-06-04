(defn builder [] {:size nil :toppings []})

(defn set-size [b size] (assoc b :size size))

(defn add-topping [b topping] (update b :toppings conj topping))

(defn build [b]
  (str "Pizza(" (:size b) ", " (apply str (interpose ", " (:toppings b))) ")"))

(println (-> (builder)
             (set-size "M")
             (add-topping "cheese")
             build))
