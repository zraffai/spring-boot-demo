From openjdk:8-jdk-alpine
VOLUME /tmp
ADD src /src
ADD target /target
ADD Servers /Servers
ADD target/my-first-application-0.0.1-SNAPSHOT.jar my-first-application-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /my-first-application-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/my-first-application-0.0.1-SNAPSHOT.jar"]
