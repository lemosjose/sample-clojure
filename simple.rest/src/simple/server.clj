(ns simple.server
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

;;sample response for a test of the server
(defn respond-server [request]
  {:status 200 :body "pong!"})


(defn non-allowed [request]
  {:status 403 :body "nope!"})

(def routes
  (route/expand-routes
   #{["/test" :get respond-server :route-name :test]}))



(defn server-spec []
  (http/create-server
   {::http/routes routes
    ::http/type :jetty
    ::http/port 8890}))

(defn bootstrap []
  (http/start (server-spec)))