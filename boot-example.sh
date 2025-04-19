#!/bin/bash
VAR_CONTEXT=$1
export SPRING_DATASOURCE_USERNAME=usuario
export SPRING_DATASOURCE_PASSWORD=pa55w0rd3BD
if [ "$VAR_CONTEXT" = "test" ]; then
    export SPRING_PROFILES_ACTIVE=test
    export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/TEST_SYSACAD
    ./mvnw clean test
fi

if [ "$VAR_CONTEXT" = "production" ]; then
  export SPRING_PROFILES_ACTIVE=prod
  export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/SYSACAD
  ./mvnw spring-boot:run
fi

if [ "$VAR_CONTEXT" = "development" ]; then
  export SPRING_PROFILES_ACTIVE=dev
  export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/DEV_SYSACAD
  ./mvnw spring-boot:run
fi




