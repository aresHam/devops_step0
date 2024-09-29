# Step 2: Package the application into a Docker image
# Use an official OpenJDK runtime as the base image
# docker이미지 생성하기
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file from the build stage
COPY build/libs/*.jar app.jar

# Expose the port the application runs on
EXPOSE 9000

# Define the command to run the application. 자바의 main()과 같음
ENTRYPOINT ["java", "-jar", "app.jar"]