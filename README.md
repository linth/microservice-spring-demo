# microservice-spring-demo
demo and deploy several spring-boot project with docker &amp; docker-compose.

# project description
there are three spring-boot applications in this microservice architecture. 
 - auth (http://localhost:8080/)
 - log (http://localhost:8081/)
 - video_streaming (http://localhost:8082/)

# package three projects
```
$ sudo ./mvnw clean package
```

# use `docker-compose` to deploy your project.
```
$ sudo docker-compose up -d 
```

# use `sh.sh` to deploy single project if you want.
```
$ cd <project_name> # e.g., cd auth
$ sh sh.sh
```
