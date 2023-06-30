FROM amazoncorretto:17
MAINTAINER mcaldentey
COPY target/backendpf-0.0.1-SNAPSHOT.jar backendpf-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backendpf-0.0.1-SNAPSHOT.jar"]
