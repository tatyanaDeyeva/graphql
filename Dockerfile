# базовый докер-образ, содержащий linux и jdk
FROM openjdk:11
# копирование моего jar в докер
COPY target/graphql-0.0.1-SNAPSHOT.jar graphql-0.0.1-SNAPSHOT.jar
# выполнение заданных команд (запуск java приложения в нашем случае)
ENTRYPOINT ["java","-jar","/graphql-0.0.1-SNAPSHOT.jar"]