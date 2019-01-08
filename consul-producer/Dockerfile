FROM docker.io/java:8
WORKDIR /opt/java
COPY target/consul-producer-0.0.1-SNAPSHOT.jar /opt/java/app.jar
CMD ["java", "-jar", "app.jar"]