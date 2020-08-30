FROM tomcat:9.0

MAINTAINER "Pavlin Stoenchev"

ADD target/task-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

EXPOSE 8080

