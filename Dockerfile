FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081
# docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -d -p 3306:3306 mysql:latest
# cd C:\Users\Luis\Documents\workspace-spring-tool-suite-4-4.10.0.RELEASE\phoneapp
# cd C:\Users\Luis\Documents\workspace-spring-tool-suite-4-4.10.0.RELEASE\phoneapp
# docker build -t luisgomezcaballero/phoneapp:latest .
# docker run -it -p8080:8080 --name phoneapp luisgomezcaballero/phoneapp:latest

# docker run --name jenkins -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts-jdk11
# http://localhost:8080/
# luis/luis
# docker inspect jenkins
# 172.17.0.2

# docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
# http://localhost:9000/
# admin/admin or admin/luis
# ifconfig
# 172.17.0.3

# docker run -it --name git2 alpine/git:latest tail -f /dev/null
# docker exec -it git bash
