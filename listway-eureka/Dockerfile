FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER wangiegie@gmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /listway-eureka

WORKDIR /listway-eureka

EXPOSE 8761

ADD ./listway-eureka/target/listway-eureka.jar ./

CMD java -Xms512m -Xmx512m -XX:PermSize=256M -XX:MaxNewSize=256m -XX:MaxPermSize=256m  -Djava.security.egd=file:/dev/./urandom -jar listway-eureka.jar
