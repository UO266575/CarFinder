FROM maven:3.8.4-openjdk-17-slim
COPY . /app
WORKDIR /app
RUN mvn clean package \
    && mv target/carfinder-backend.jar /app.jar \
    && rm -rf /app/target
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]