;; Observer contract: next*-then-terminal.
;; An observer wraps next/error/complete with a "stopped" flag set on the
;; first terminal (complete or error); afterwards next() and further
;; terminals are no-ops.

(defn make-observer []
  (let [stopped (atom false)]
    {:next     (fn [v]
                 (when-not @stopped
                   (println v)))
     :error    (fn [_]
                 (when-not @stopped
                   (reset! stopped true)
                   (println "error")))
     :complete (fn []
                 (when-not @stopped
                   (reset! stopped true)
                   (println "complete")))}))

(let [obs (make-observer)]
  ((:next obs) 1)
  ((:next obs) 2)
  ((:complete obs))
  ((:next obs) 3)) ;; ignored: observer already stopped
