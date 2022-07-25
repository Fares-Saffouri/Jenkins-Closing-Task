FROM openjdk:8-jdk-alpine

COPY ./target/demo-0.0.1-SNAPSHOT.jar ynet-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ynet-0.0.1-SNAPSHOT.jar"]
