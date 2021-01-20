FROM openjdk:11
WORKDIR /home/app
COPY target/test-unsplash-0.0.1-SNAPSHOT.jar /home/app/app.jar
EXPOSE 8080
ENTRYPOINT java -jar /home/app/app.jar
