(defn real-subject [] "loaded")

(let [cache (atom nil)
      request (fn []
                (when (nil? @cache)
                  (reset! cache (real-subject)))
                @cache)]
  (println (request)))
