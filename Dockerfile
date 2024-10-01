FROM openjdk:17.0.2-jdk-slim-buster
ARG JAR_FILE=build/libs/choes-1.0.0-SNAPSHOT.jar
COPY ${JAR_FILE} chose.jar
ENTRYPOINT ["java", "-jar", "/chose.jar"]