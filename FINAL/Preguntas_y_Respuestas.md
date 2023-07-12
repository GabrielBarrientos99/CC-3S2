**NOTA : Existe un MARKDOWN en cada Fase de la pregunta1**
----

Pregunta 1 TDD (6 puntos)

En este ejercicio deberás construir una carpeta llamada Pregunta1, y dentro de ellas debes construir 6
pequeños proyectos que se llamen Antes, Fase1, Fase2, Fase3, Fase4, Fase5 y debes coloca un archivo
readme.md general que indique claramentes las diferencias y los avances de cada carpeta. No es
necesario colocar imágenes. 

Antes

También existe una política para la eliminación de pasajeros de los vuelos: un pasajero regular puede ser eliminado de un vuelo, pero un pasajero VIP no puede ser eliminado.
Veamos el diseño inicial de esta aplicación. Tiene un campo llamado flightType en la clase Flight. Su valor determina el comportamiento de los métodos addPassenger y removePassenger. Los desarrolladores deben centrarse en la toma de decisiones a nivel del código para estos dos métodos.

Fase 1

Para crear una aplicación confiable y poder comprender e implementar la lógica comercial de manera fácil y segura, se considera cambiar la aplicación al enfoque TDD.

**Pregunta:**

Sigue la lógica comercial para un vuelo comercial y traduce eso escribiendo una prueba llamada AirportTest. ¿Cuáles son los resultados de las pruebas con cobertura obtenidad?
¿Puedes indicar algunas conclusiones de lo anterior, necesitamos refactorizar?

Podemos notar una cobertura de 64% en general , pero  un 50% en la clase Flight . No se ha analizado los casos por default del switch , es decir , cuando el tipo de vuelo sea
diferente de economico o Negocios. Ademas Necesitamos refactorizar esta priemra implementación debido a que las funciones addPassenger y removePassenger dependen del atributo 
flightType y si se quisiera agregar un nuevo tiepo de vuelo se tendria que modificar esta clase lo cual no es recomendable y violaria el principio de abierto cerrado.

![image](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/e210fdef-9e96-406a-857c-182487d80c85)


Fase 2
La clave para la refactorización es mover el diseño para usar polimorfismo en lugar de código condicional de estilo procedimental. Con el polimorfismo el método al que está llamando no se determina en tiempo de compilación, sino en tiempo de ejecución, según el tipo de objeto efectivo.
Para el ejercicio tratamos la refactorización de la aplicación de gestión de vuelos reemplazando el condicional con polimorfismo: se elimina el campo flightType y se introduce una jerarquía de clases.
El principio en acción aquí se llama principio abierto/cerrado.




