FROM openjdk:17
EXPOSE 8080
copy ./target/employee-management-docker.jar employee-management-docker.jar
CMD ["java","-jar","employee-management-docker.jar"]