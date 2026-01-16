Ingresar Variables de entorno en el sistema (Ejemplo con Linux):
 
export DB_URI="jdbc:mysql://localhost:3306/prueba" #Base de datos


export DB_USER="root" #Usuario


export DB_PASSWORD="password" #Password


export DB_DRIVER="com.mysql.cj.jdbc.Driver" # Driver utilizado (Mysql)


Comandos para ejecturar el proyecto: 



docker compose up -d  #Levantar base de datos mysql, (levantar primero para que evitar fallos con el backend)



mvn spring-boot:run # Correr Backend
