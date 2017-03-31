; Changed .core to .app, changed file name too
(ns learning-clojure.app
  (:require [ring.adapter.jetty :as jetty]))

; Top-level of the app, called a ‘handler’ in ring parlance
; Handlers must return a ‘ring’ response map
; Typically contains a status code and the body of the request
(defn app
  [request]
  {:status 200
   :body (:uri request)})

(defn run
  []
  (def server (jetty/run-jetty #'app {:port 8080 :join? false})))
