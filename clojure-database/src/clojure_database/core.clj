(ns clojure-database.core 
  (:require [clojure.java.jdbc :as jdbc]))

(def pg-spec {:dbtype "postgresql" :dbname "testdb" :user "postgres" :password "sample_clojure"})

;;; foo/bar queries
(defn foo-function[]
  (jdbc/insert! pg-spec :foo {:data "bar"})
  (jdbc/query pg-spec ["SELECT 1*1 AS result"])
  (jdbc/insert! pg-spec :mussum {:data "cassildis!"})
  
  (jdbc/query pg-spec ["SELECT * FROM TESTING"]))