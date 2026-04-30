# Build stage
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /workspace

# Cache Maven dependencies separately
COPY pom.xml .
COPY src ./src

RUN ./mvnw -B -Dmaven.test.skip=true package

# Runtime stage
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

COPY --from=build /workspace/target/*.jar app.jar

EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
