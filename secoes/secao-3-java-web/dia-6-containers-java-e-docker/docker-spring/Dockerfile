FROM eclipse-temurin:17-jdk-jammy AS build-image
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build-image /app/target/*.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
