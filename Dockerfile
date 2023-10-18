# Usamos una imagen base con Java 17
FROM openjdk:17-alpine

VOLUME /tmp
COPY target/*.jar app.jar

# Exponer el puerto en el que la aplicación escucha (puerto 8080 de Spring Boot, por ejemplo)
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]