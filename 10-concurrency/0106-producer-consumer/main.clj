(import 'java.util.concurrent.LinkedBlockingQueue)

(let [q (LinkedBlockingQueue. 2)
      done ::done]
  (future
    (doseq [v (range 1 6)] (.put q v))
    (.put q done))
  (loop [sum 0]
    (let [v (.take q)]
      (if (= v done)
        (println sum)
        (recur (+ sum v))))))
