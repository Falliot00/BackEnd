FROM amazoncorretto:11-alpine-jdk
MAINTAINER Falliot
COPY target/Falliot-0.0.1-SNAPSHOT.jar falliot-app.jar
ENTRYPOINT ["java","-jar","/falliot-app.jar"]
