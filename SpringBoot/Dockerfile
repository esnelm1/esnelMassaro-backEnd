FROM amazoncorretto:20-alpine-jdk // imagen de java
MAINTAINER esnelmassaro // author
COPY  target/SpringBoot-0.0.1-SNAPSHOT.jar esnelPortfolio-app.jar // va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar","/esnelPortfolio-app.jar"]  // es la instruccion que se va a ejecutar primero
