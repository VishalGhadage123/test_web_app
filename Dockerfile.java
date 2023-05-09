FROM tomcat:8.0.20-jre8

COPY target/app.war  /usr/local/tomat/webapps/app.war