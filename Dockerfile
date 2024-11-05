FROM openjdk:17.0.2-jdk-slim-buster
ARG JAR_FILE=build/libs/choes-1.0.0-SNAPSHOT.jar
COPY ${JAR_FILE} shose.jar
ENTRYPOINT ["java", "-jar", "/shose.jar"]