FROM sumitdatta2015/my-jre8
EXPOSE 80
ADD /target/dockerdemo.jar dockerdemo.jar
CMD ["java","-jar","dockerdemo.jar"]
