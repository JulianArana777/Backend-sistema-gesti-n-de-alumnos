Variables de entorno:
 
 DB_URI="jdbc:mysql://localhost:3306/prueba"
 DB_USER="root"
 DB_PASSWORD="password"
 DB_DRIVER="com.mysql.cj.jdbc.Driver"


Comandos para ejecturar el proyecto: 

 docker compose up -d #Levantar base de datos mysql 

 mvn spring-boot:run # Correr Backend