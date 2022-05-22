FROM openjdk:11
WORKDIR /usr/app
COPY build/libs/webapp-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]