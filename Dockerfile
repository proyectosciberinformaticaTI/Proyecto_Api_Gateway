FROM openjdk:8-jdk-alpine
ADD target/Proyecto_Api_Gateway-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]