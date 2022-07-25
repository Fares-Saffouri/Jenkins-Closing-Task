FROM openjdk:8-jdk-alpine

COPY **/*.jar **/*.jar

ENTRYPOINT ["java","-jar","**/*.jar"]
