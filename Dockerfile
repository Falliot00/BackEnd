FROM amazoncorretto:11-alpine-jdk                       //de que imagen partimos
MAINTAINER Falliot                                      //quien es el dueño
COPY target/Falliot-0.0.1-SNAPSHOT falliot-app.jar      //va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar","/falliot-app.jar"]           //es la instruccion que se va a ejecutar primero
