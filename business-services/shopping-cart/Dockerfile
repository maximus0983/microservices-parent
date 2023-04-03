FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/shopping-cart-0.0.1-SNAPSHOT.jar /shopping-cart.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/shopping-cart.jar"]