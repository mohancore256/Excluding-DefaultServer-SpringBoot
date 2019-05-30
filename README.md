# Excluding-DefaultServer-SpringBoot

https://dzone.com/articles/spring-boot-changingconfiguring-the-default-embedded-server

In a previous post, we created a web-based Spring Boot application that uses Embedded Tomcat as the default server running on the default port, 8080. Spring Boot supports Tomcat, Undertow, and Jetty as embedded servers. Now, we will change and/or configure the default embedded server and common properties to all the available servers.

Spring Boot provides a convenient way of configuring dependencies with its starters. For changing the embedded server, we will user its spring-boot-starter-undertow.


(1)Adding Dependencies

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-undertow</artifactId>
</dependency>

(2)spring-boot-starter-web comes with Embedded Tomcat. We need to exclude this dependency.

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
  <exclusions>
    <exclusion>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
    </exclusion>
  </exclusions>
</dependency>

(3)server.port=8082(which ever we want)