# clojure-database

This project serves as a sample for connecting to a postgresql database running in docker through Clojure code 

## Necessary for Testing

First, build the Docker container from the dockerfile provided, since we'll need both clojure and postgresql.

After that, we can start the service with: 

`docker compose up`

Create the database with 

`CREATE DATABASE testdb`

"testdb" will match with `db-spec` on `core.clj` file.

## On REPL

Now that you have everything settled, we can just run the test function from any REPL, this project was tested using clojure's default REPL, but leinigen is also settled with `project.clj`

Run the test with:

(require 'core) 

Inside docker's container