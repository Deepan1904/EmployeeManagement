FROM openjdk:17
WORKDIR /app
EXPOSE 8080
copy ./target/employee-management-docker.jar employee-management-docker.jar
CMD ["java","-jar","employee-management-docker.jar"]
