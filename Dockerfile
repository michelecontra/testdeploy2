# Usa un'immagine di base di OpenJDK
FROM openjdk:17-alpine

# Imposta la directory di lavoro all'interno del container
WORKDIR /app

# Copia il tuo JAR generato nella directory di lavoro del container
COPY target/calcolatrice-v1.jar app.jar

# Usa il comando "java -jar" per eseguire l'applicazione quando il container viene avviato
CMD ["java", "-jar", "app.jar"]