# Primera Etapa: Compilación (Utiliza una imagen base con JDK y Maven)
FROM maven:3.9.5-eclipse-temurin-21-alpine AS build

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos de configuración de Maven (pom.xml) y descarga las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia el código fuente
COPY src ./src

# Compila el código y crea el JAR ejecutable
RUN mvn package -DskipTests

# Segunda Etapa: Ejecución (Utiliza una imagen base ligera para la ejecución)
FROM eclipse-temurin:21-jre-alpine

# Define un argumento para el nombre del archivo JAR (necesario si el nombre cambia)
ARG JAR_FILE=target/*.jar

# Copia el JAR generado de la etapa 'build' a la etapa 'run'
COPY --from=build /app/${JAR_FILE} app.jar

# Expone el puerto por defecto de Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]