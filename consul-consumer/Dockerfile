FROM docker.io/java:8
WORKDIR /opt/java
COPY target/consul-consumer-0.0.1-SNAPSHOT.jar /opt/java/app.jar
CMD ["java", "-jar", "app.jar"]