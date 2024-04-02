FROM eclipse-temurin:17

LABEL author="Javier Huebra"

COPY target/pruebah2-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

# docker build -t app-user-image:1.0 .