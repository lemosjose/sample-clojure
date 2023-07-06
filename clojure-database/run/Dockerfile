FROM ubuntu 

RUN apt update && apt install -y curl openjdk-17-jre openjdk-17-jdk postgresql
RUN mkdir -p work
RUN curl -o https://download.clojure.org/install/linux-install-1.11.1.1347.sh
RUN chmod +x linux-install-1.11.1.1347.sh
RUN bash linux-install-1.11.1.1347.sh


COPY ../src/clojure_database/core.clj /work

WORKDIR /work