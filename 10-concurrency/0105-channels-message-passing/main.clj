(import 'java.util.concurrent.LinkedBlockingQueue)

(let [q (LinkedBlockingQueue.)
      done ::done]
  (future
    (doseq [v [1 2 3]] (.put q v))
    (.put q done))
  (loop [acc []]
    (let [v (.take q)]
      (if (= v done)
        (println (apply str (interpose " " acc)))
        (recur (conj acc v))))))
