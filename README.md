# Sistema Académico basado en sysacad

Proyecto realizado en **Spring Boot**

- https://start.spring.io/

## Requerimientos
### En windows
- JDK 21+ (puede ser https://adoptium.net/es/)
### En Linux
- Utilizar **sdkman** (https://sdkman.io/) para descargar JDK de varios proveedores y versiones 
### Base de Datos
- Servidor de base de datos PostgreSQL
- Base de datos para entornos: **test**, **development**, **production** 

## Pasos para ejecutar el proyecto
`./mvnw dependency:resolve`

## Ejecución de Test
```
export SPRING_DATASOURCE_USERNAME=usuario
export SPRING_DATASOURCE_PASSWORD=pa55w0rd3BD
export SPRING_PROFILES_ACTIVE=test
./mvnw clean test
```

## Ejecución de la aplicación
En Windows con PowerShell reemplazar **export** por **$Env:**.
- https://learn.microsoft.com/es-es/powershell/module/microsoft.powershell.core/about/about_environment_variables?view=powershell-7.5
```
export SPRING_DATASOURCE_USERNAME=usuario
export SPRING_DATASOURCE_PASSWORD=pa55w0rd3BD
export SPRING_PROFILES_ACTIVE=development #(puede ser también production)
./mvnw spring-boot:run
```