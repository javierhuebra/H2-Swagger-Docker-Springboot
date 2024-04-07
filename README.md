# Practica de api rest con BD H2 Y Swagger

## Si se levanta el proyecto la base de datos se crea automaticamente con los datos de prueba
### Se puede entrar a la consola de la base de datos en memoria en la siguiente url
```http://localhost:8080/h2-console```
### La documentacion en swagger se encuentra en la siguiente url
```http://localhost:8080/swagger-ui.html```

### Este proyecto se encuentra dockerizado y subido en el siguiente repositorio
```https://hub.docker.com/repository/docker/javierhuebra/user-api/general```

### Se deployó la api en un servidor gratuito para probar
###GET All users
```https://user-api-1-0.onrender.com/users```
###POST Create user
```https://user-api-1-0.onrender.com/users```
```
{
    "name": "username01",
    "password": "password123"
}
```
