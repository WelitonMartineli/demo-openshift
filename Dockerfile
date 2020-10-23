FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","encurtador-url-0.0.1-SNAPSHOT.jar"]