(ns requests
    (:require [clj-http.client :as client])
    (:require [clojure.data.json :as json]))

(def url "https://api.bitvalor.com/v1/ticker.json")

(defn checkState []
  (println "Testando a API do Ticker Bitvalor")
  ;; o @ realiza o deref necessário
  (let [response @(client/get url{:accept :json})]
    (if (= 200 (:status response))
      (println "Funcionando")
         true)
      (println "failed") 
    ))

(def Data 
  (json/read-str 
   (slurp url :key-fn last)
   ))


;; testing the get-in "inception"
(println (get-in Data ["ticker_1h" "total" "last"]))