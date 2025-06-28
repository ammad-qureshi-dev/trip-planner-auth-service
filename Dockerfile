FROM amazoncorretto:21 as builder

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew && ./gradlew build --no-daemon

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "build/libs/app-0.0.1-SNAPSHOT.jar"]