
FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
EXPOSE 8088
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
