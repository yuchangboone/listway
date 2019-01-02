FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER wangiegie@gmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /listway-gateway

WORKDIR /listway-gateway

EXPOSE 9999

ADD ./listway-gateway/target/listway-gateway.jar ./

CMD java -Xms512m -Xmx512m -XX:PermSize=256M -XX:MaxNewSize=256m -XX:MaxPermSize=256m  -Djava.security.egd=file:/dev/./urandom -jar listway-gateway.jar
