FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /app
COPY . .
RUN javac sample.java

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/sample.class .
CMD ["java", "sample"]