FROM openjdk:8
EXPORT 8190
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java","-jar","/spring-docker.jar"]