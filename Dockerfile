FROM openjdk:16
ADD target/springbootex-0.0.1-SNAPSHOT.jar springExApp.jar
ENTRYPOINT ["java", "-jar", "springExApp.jar"]