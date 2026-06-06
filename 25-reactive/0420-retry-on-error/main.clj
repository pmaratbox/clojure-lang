;; retry(n): resubscribe to the source on error up to n times.
;; The source succeeds on the 3rd subscription.

;; An observer is a map of :next/:error/:complete closures.
;; A source is a function taking an observer and producing events.

(defn make-source []
  (let [attempts (atom 0)]                 ; subscription counter
    (fn [observer]
      (let [k (swap! attempts inc)]
        (println (str "attempt " k))
        (if (< k 3)
          ((:error observer) (str "fail " k))
          (do ((:next observer) "ok")
              ((:complete observer))))))))

(defn retry [source n]
  (fn [observer]
    (let [remaining (atom n)
          attempt   (fn attempt []
                      (source {:next     (:next observer)
                               :error    (fn [e]
                                           (if (pos? @remaining)
                                             (do (swap! remaining dec) (attempt))
                                             ((:error observer) e)))
                               :complete (:complete observer)}))]
      (attempt))))

(let [src (retry (make-source) 2)]          ; up to 2 resubscriptions
  (src {:next     (fn [v] (println v))
        :error    (fn [e] (println (str "error " e)))
        :complete (fn [] nil)}))
