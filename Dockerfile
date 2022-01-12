FROM openjdk:8
WORKDIR /app/
COPY ./src /app/
RUN javac -cp antlr-4.9.3-complete.jar: Main.java