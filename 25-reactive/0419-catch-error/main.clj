;; catchError: on an error from the source, switch to a fallback stream.

(defn observable
  "An observable is a function taking an observer {:next :error :complete}
   and wiring a producer to it."
  [subscribe]
  subscribe)

(defn subscribe [obs observer] (obs observer))

(defn catch-error
  "Forwards next values; on error subscribes to the fallback instead of
   propagating the error."
  [source fallback]
  (observable
    (fn [observer]
      (subscribe source
        {:next     (:next observer)
         :error    (fn [_] (subscribe fallback observer))
         :complete (:complete observer)}))))

;; source emits 1, 2, then signals error.
(def source
  (observable
    (fn [observer]
      ((:next observer) 1)
      ((:next observer) 2)
      ((:error observer) (ex-info "boom" {})))))

;; fallback emits 9 then completes.
(def fallback
  (observable
    (fn [observer]
      ((:next observer) 9)
      ((:complete observer)))))

(subscribe (catch-error source fallback)
  {:next     (fn [x] (println x))
   :error    (fn [_])
   :complete (fn [])})
