FROM payara/micro:5.184

EXPOSE 9009 8080 4848 8181 6300

ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,address=9009,server=y,suspend=n"

RUN echo '-------------- env ---------------'
RUN env

# now make sure to deploy the application (copy war into deployment folder)
COPY target/simplejbatch.war .

ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9009","-jar", "payara-micro.jar", "--deploy", "simplejbatch.war"]