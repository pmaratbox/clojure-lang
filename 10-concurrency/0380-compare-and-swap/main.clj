(import java.util.concurrent.atomic.AtomicInteger)

(def counter (AtomicInteger. 0))

(defn cas-inc []
  (loop []
    (let [cur (.get counter)]
      (when-not (.compareAndSet counter cur (inc cur))
        (recur)))))

(def threads
  (doall
    (for [_ (range 10)]
      (future
        (dotimes [_ 10]
          (cas-inc))))))

(doseq [t threads] @t)
(println (.get counter))
