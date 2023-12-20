
# To build, run the following command from the top level project directory:
#
# docker build -f src/main/docker/Dockerfile .

FROM openjdk:17 as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM   openjdk:17
COPY --from=builder dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder internal-dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder application/ ./

ENTRYPOINT ["java", "-jar", "application.jar"]
