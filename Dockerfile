# Usar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Crear un directorio en el contenedor para la aplicación
WORKDIR /app

# Copiar el archivo WAR de la aplicación en el contenedor
COPY target/apipruebadavi-1.war /app/ApiPruebaDavi-1.war

# Especificar el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/ApiPruebaDavi-1.war"]
