FROM bellsoft/liberica-openjdk-alpine:17

CMD ["./gradlew", "clean", "build"]

VOLUME /tmp

ARG JAR_FILE=build/libs/*.jar

RUN apk update && apk add bash
COPY ../wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh

COPY ${JAR_FILE} app.jar