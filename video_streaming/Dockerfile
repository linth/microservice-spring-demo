FROM openjdk:8-jdk-alpine
VOLUME /tmp
# COPY --from=build "target/*.jar" "app.jar" # keep stay to figure out this issue.
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081