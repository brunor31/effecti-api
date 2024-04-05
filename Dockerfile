FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
CMD ["java", "-jar","app.jar"]