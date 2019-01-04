FROM docker.io/java:8
WORKDIR /opt/java
COPY target/zipkin-simple-0.0.1-SNAPSHOT.jar /opt/java/zipkin-simple-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "zipkin-simple-0.0.1-SNAPSHOT.jar"]