FROM openjdk:8-jdk-alpine
ADD target/hello-app-1.0.0.jar app.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","/app.jar"]
