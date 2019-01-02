FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER wangiegie@gmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /listway-auth

WORKDIR /listway-auth

EXPOSE 3000

ADD ./listway-auth/target/listway-auth.jar ./

CMD java -Xms512m -Xmx512m -XX:PermSize=256M -XX:MaxNewSize=256m -XX:MaxPermSize=256m -Djava.security.egd=file:/dev/./urandom -jar listway-auth.jar
