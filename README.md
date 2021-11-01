# Phone App
![alt text](logo.png "Phone App")

Application for buying smartphones

### About the project
project.gif

Explanation of the project

### Installation
JDK

Spring Tool Suite 4

Import as Maven project

### Usage
java -jar PhoneApp.jar

Use Postman

### Roadmap
[x] Create an endpoint to retrieve the phone catalog, and pricing.

[x] Create endpoints to check and create an order.

[x] It should have test.

[ ] It should be documented in the readme file.

[ ] It should be a REST API.

[ ] Docker oriented.

[ ] Microservice approach.

[ ] Database access from the microservices.

[ ] Java 10, .NET, NodeJS, Scala.

[ ] Shields (https://shields.io/).


### Notes

http://localhost:8081/h2-console
docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -d -p 3306:3306 mysql:latest
cd C:\Users\Luis\Documents\workspace-spring-tool-suite-4-4.10.0.RELEASE\phoneapp
docker build -t luisgomezcaballero/phoneapp:latest .
docker run -it -p8081:8081 --name phoneapp luisgomezcaballero/phoneapp:latest

docker run --name jenkins -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts-jdk11
http://localhost:8080/
luis/luis
docker inspect jenkins
172.17.0.2

docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
http://localhost:9000/
admin/admin or admin/luis
ifconfig
172.17.0.3
