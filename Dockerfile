FROM maven AS build

WORKDIR /code

RUN git clone https://github.com/Fares-Saffouri/Jenkins-Closing-Task.git && \
    cd Jenkins-Closing-Task && \
    mvn package

FROM openjdk:17.0.2-oraclelinux8

WORKDIR /app

COPY --from=build **/*.jar /app/xmltohtml-0.0.1-SNAPSHOT.jar

EXPOSE 8090

CMD ["java","-jar", "/app/xmltohtml-0.0.1-SNAPSHOT.jar"]
