# Reto sofka
## Resumen

En este reto vamos a modelar un concurso de preguntas y respuestas, la intención es diseñar una solución que permita tener un banco de preguntas con diferentes opciones para una única respuesta, además cada pregunta debe estar en una categoría o un grupos de preguntas similares del mismo nivel, por cada ronda se deberá asignar un premio a conseguir, las rondas del juego son nivel que van aumentando en la medida que el jugador gana premios.

Dentro del reto se debe considerar lo siguiente:

- Manejo de clases u objetos a nivel de modelamiento.

- Persistencia de datos o guardado de históricos.

- Manejos de listas o colecciones y ciclos de control adecuados

- Conocimiento de cualquier lenguaje de programación.

- Manejo de Git (versión de control).



## Ejecicion del programa

Se ha adjuntado el archivo "databaseChallenge.sql" el cual se puede importar a un servicio de gestion de base de datos como mySQL. Este contiene la información respecto a los ganadores, preguntas y respuestas que se han de cargar al sistema.

Se debe modificar en el archivo "ConnectionDB.java" las variables url, user y password segun sea pertiente para conectar la aplicacion con la base de datos local.

Si es necesario en el archivo View.java se debe agrabar como iconno al labelImg la imagen denominada preguntas que se encuentra en la carpeta img. Al intentar importar esta imagen dentro del documento se generaron errores. Se sugiere por lo tanto cargarla como imagen externa.
