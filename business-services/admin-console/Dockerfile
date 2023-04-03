FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/admin-console-0.0.1-SNAPSHOT.jar /admin-console.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/admin-console.jar"]