docker run --name pg-container --env POSTGRES_PASSWORD=sample_clojure --detach postgres

#creates the database for connecting and creating
docker run -it --link pg-container:postgres postgres psql -h postgres -U postgres
docker exec -it pg-container mkdir work
docker cp src/clojure_database/core.clj pg-container:/work
docker cp clojure-install.sh pg-container:/work
docker exec -it pg-container bash /work/clojure-install.sh
docker exec -it pg-container bash