FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/users-0.0.1-SNAPSHOT.jar /users.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/users.jar"]