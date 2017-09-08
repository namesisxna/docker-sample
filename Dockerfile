FROM java:8
EXPOSE 80
ADD /target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]
