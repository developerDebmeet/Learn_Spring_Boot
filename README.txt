# Learn_Spring_Boot

Setting up Spring Web Projects before Spring Boot was NOT easy :
    - need to define maven dependencies and manage their framework versions
        - spring-webmvc, jackson-databind, log4j etc
    - need to define web.xml
        - define front controller for Spring Framework (DispatcherServlet)
    - need to define Spring context XML file
        - define a Component Scan (<context:component-scan base-package=".." />)
    - need to install Tomcat or use tomcat7-maven-plugin OR any other web server
    - Deploy and Run the application in Tomcat


How does Spring Boot do its thing?
    - Spring boot Starter projects
    - Spring boot Auto Configuration


Spring Boot Starter Projects :
    - Goal : to help get a project up and running quickly [eg spring-boot-starter-web]
        - Web App : Spring Boot Starter Web
        - REST API : Spring Boot Starter Web
        - Talk to DB using JPA : Spring Boot Starter Data JPA [Java Persistence API]
        - Talk to DB using JDBC : Spring Boot Starter JDBC
        - Secure Web App/ REST API : Spring Boot Starter Security
    - Manage list of maven dependencies and versions for different kinds of apps :
        - Spring Boot Starter Web : Frameworks needed by typical web applications
            - spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json


Spring Boot Auto Configuration
    - Spring Boot provides Auto Configuration
        - Basic configuration to run your app using the frameworks defined in dependencies(maven/gradle)
        - Auto configuration is decided based on
            - which frameworks are in the class path
            - what is the existing configuration (Annotations etc)
                - present in jar org.springframework.boot.autoconfigure
                - eg of autoconfigure : default 404 pages for paths which are not defined in code


Spring Boot Embedded Servers
    - how to deploy app[OLD WAR Approach]?
        - install Java
        - install web/app server
            eg : tomcat/webSphere/webLogic etc
        - Deploy the application WAR [Web ARchive]
    - how its done now?
        - using embedded server
        - install Java
        - Run JAR file





