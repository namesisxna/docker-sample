FROM sumitdatta2015/my-jre8
EXPOSE 8080
ADD /target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]
