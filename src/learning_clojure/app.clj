; Changed .core to .app, changed file name too
; temporarily changed it back to debug
(ns learning-clojure.app)

; Top-level of the app, called a ‘handler’ in ring parlance
; Handlers must return a ‘ring’ response map
; Typically contains a status code and the body of the request
(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   ;:body (:uri request)})
   :body (:uri request)})

