FROM eclipse-temurin:17
VOLUME /tmp
COPY target/software-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app.jar"]