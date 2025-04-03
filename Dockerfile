# Usar uma imagem do OpenJDK 17 com JDK
FROM openjdk:17-jdk-slim

# Criar um diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado pelo Maven para dentro do container
COPY target/*.jar app.jar

# Definir a porta que será exposta no container
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
