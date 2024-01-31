FROM openjdk:17
copy ./target/employee-management-docker.jar employee-management-docker.jar
CMD ["java","-jar","employee-management-docker.jar"]