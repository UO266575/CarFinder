FROM maven:3.8.4-openjdk-17-slim
COPY . /app
WORKDIR /app
RUN mvn clean package \
    && mv target/CarFinder-0.0.1-SNAPSHOT.jar /app.jar \
    && rm -rf /app/target
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]