# Proyecto Lab06 - Spring Boot + Docker

Este proyecto recrea un entorno similar al laboratorio con PHP, pero utilizando **Java y Spring Boot**. Está dockerizado y preparado para levantar un servidor con endpoints que simulan el comportamiento del ejemplo original.

## 🐳 Requisitos

- Tener instalado **Docker** y **Docker Compose**
- (Opcional) Tener instalado **Git**

## 🚀 Instrucciones rápidas

1. Clona este proyecto o descomprime el `.zip` en tu máquina.
2. Abre una terminal en la carpeta `lab06`.
3. Ejecuta:

```bash
docker compose up --build
```

4. Una vez iniciado, visita los siguientes enlaces en tu navegador:
```bash
http://localhost:8085/lab06
http://localhost:8085/lab06/javainfo
```
## 🗂 Estructura del proyecto
```bash
lab06/
├── docker-compose.yml
├── Dockerfile
└── springboot-app/
    ├── pom.xml
    └── src/
        └── main/
            ├── java/
            │   └── com/example/springbootapp/
            │       ├── SpringbootAppApplication.java
            │       └── controller/
            │           └── InfoController.java
            └── resources/
                └── application.properties
```
5. Notas
   
El proyecto usa eclipse-temurin:17-jdk como imagen base por compatibilidad universal.
No usa Alpine para evitar errores en Mac con chip M1/M2/M3.
Está configurado para correr en el puerto 8085.

