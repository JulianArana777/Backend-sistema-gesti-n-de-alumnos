Variables de entorno:
 
 export DB_URI="jdbc:mysql://localhost:3306/prueba"
 export DB_USER="root"
 export DB_PASSWORD="password"
 export DB_DRIVER="com.mysql.cj.jdbc.Driver"


Comandos para ejecturar el proyecto: 

 docker compose up -d #Levantar base de datos mysql 

 mvn spring-boot:run # Correr Backend