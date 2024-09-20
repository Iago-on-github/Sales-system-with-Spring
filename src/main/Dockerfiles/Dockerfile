FROM ubuntu:latest
LABEL authors="55759"

# Instalações de dependências em uma única camada
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven && \
    rm -rf /var/lib/apt/lists/*

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o conteúdo para o diretório de trabalho
COPY . .

# Compila o projeto usando Maven
RUN mvn clean install

# Define o comando a ser executado quando o contêiner for iniciado
ENTRYPOINT ["top", "-b"]

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/couse-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
