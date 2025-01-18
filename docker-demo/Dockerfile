# Parant image name
FROM openjdk:17

EXPOSE 8081

ADD target/spring-boot-docker.jar spring-boot-docker.jar

# To run the java jar file
ENTRYPOINT [ "java","-jar","spring-boot-docker.jar" ]