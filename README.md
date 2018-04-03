# Spring Cloud Config Server 1.0.0

This project implements a [Spring Cloud Configuration Service] (https://spring.io/guides/gs/centralized-configuration/) using [Spring Boot](http://projects.spring.io/spring-boot/).  


## Requirements

For building and running the application you need:

- [JDK 9](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
- [Maven 3](https://maven.apache.org)

## Configuration
This project uses the standard yml-based spring configuration.  The following is a resources for [Getting Started with Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/).

Cloud Config Server uses [Spring Security Basic Auth](http://www.baeldung.com/spring-security-basic-authentication).  This configuration is for demo purposes and should not be used for production. 

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `org.lds.ics.EA.CloudConfigServer.CloudConfigServerApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## Running in Cloud Foundry
OAuth Proxy contains manifests to deploy to [CloudFoundry](https://ui.cf.lds.org/#/Develop).  You will need to configure your portfolio/space etc.

## Sample Git Config Repository layout
```shell
<git repo>/<project name>/

application-dev.yml  application-local.yml  application-prod.yml  application.yml

```

