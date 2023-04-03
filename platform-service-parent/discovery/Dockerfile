FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/discovery-0.0.1-SNAPSHOT.jar /discovery.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/discovery.jar"]