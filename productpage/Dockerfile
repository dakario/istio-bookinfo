FROM openjdk:8-jdk-alpine as build
WORKDIR /workspace/app
ENV SERVER_PORT 8080
ENV ENABLE_RATINGS false
ENV STAR_COLOR black


COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE ${SERVER_PORT}
ENTRYPOINT ["java","-cp","app:app/lib/*","com.bookinfo.ProductpageApplication"]
