FROM openjdk:20-ea-7-jdk-slim-bullseye
EXPOSE 8080
ADD /target/showcase-0.0.1-SNAPSHOT.jar showcase.jar
ENTRYPOINT ["java","-jar","showcase.jar"]]