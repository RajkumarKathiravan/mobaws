FROM eclipse-temurin:24
COPY target/mob.jar second-mob.jar
CMD [ "java","-jar","second-mob.jar" ]