FROM eclipse-temurin:11-alpine

ARG JAR_FILE
COPY target/${JAR_FILE} /opt/app.jar

ENTRYPOINT exec java -Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true -jar /opt/app.jar