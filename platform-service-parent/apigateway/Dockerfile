FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/apigateway-0.0.1-SNAPSHOT.jar /apigateway.jar

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "/apigateway.jar"]