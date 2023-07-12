**NOTA : Existe un MARKDOWN en cada Fase de la pregunta1**
----

Pregunta 1 TDD (6 puntos)

En este ejercicio deberás construir una carpeta llamada Pregunta1, y dentro de ellas debes construir 6
pequeños proyectos que se llamen Antes, Fase1, Fase2, Fase3, Fase4, Fase5 y debes coloca un archivo
readme.md general que indique claramentes las diferencias y los avances de cada carpeta. No es
necesario colocar imágenes. 

----

**Antes**

También existe una política para la eliminación de pasajeros de los vuelos: un pasajero regular puede ser eliminado de un vuelo, pero un pasajero VIP no puede ser eliminado.
Veamos el diseño inicial de esta aplicación. Tiene un campo llamado flightType en la clase Flight. Su valor determina el comportamiento de los métodos addPassenger y removePassenger. Los desarrolladores deben centrarse en la toma de decisiones a nivel del código para estos dos métodos.

----

**Fase 1**

Para crear una aplicación confiable y poder comprender e implementar la lógica comercial de manera fácil y segura, se considera cambiar la aplicación al enfoque TDD.

**Pregunta:**

Sigue la lógica comercial para un vuelo comercial y traduce eso escribiendo una prueba llamada AirportTest. ¿Cuáles son los resultados de las pruebas con cobertura obtenidad?
¿Puedes indicar algunas conclusiones de lo anterior, necesitamos refactorizar?

Podemos notar una cobertura de 64% en general , pero  un 50% en la clase Flight . No se ha analizado los casos por default del switch , es decir , cuando el tipo de vuelo sea
diferente de economico o Negocios. Ademas Necesitamos refactorizar esta priemra implementación debido a que las funciones addPassenger y removePassenger dependen del atributo 
flightType y si se quisiera agregar un nuevo tiepo de vuelo se tendria que modificar esta clase lo cual no es recomendable y violaria el principio de abierto cerrado.

![image](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/e210fdef-9e96-406a-857c-182487d80c85)

----

**Fase 2**

La clave para la refactorización es mover el diseño para usar polimorfismo en lugar de código condicional de estilo procedimental. Con el polimorfismo el método al que está llamando no se determina en tiempo de compilación, sino en tiempo de ejecución, según el tipo de objeto efectivo.
Para el ejercicio tratamos la refactorización de la aplicación de gestión de vuelos reemplazando el condicional con polimorfismo: se elimina el campo flightType y se introduce una jerarquía de clases.
El principio en acción aquí se llama principio abierto/cerrado.

**Pregunta:**

- La refactorización se logrará manteniendo la clase Flight base y para cada tipo condicional, agregando una clase separada para extender Flight. Debes cambiar addPassenger y
removePassenger a métodos abstractos y delegar su implementación a subclases. El campo flightType ya no es significativo y se eliminará.

- Implementa una clase EconomyFlight que amplía Flight e implementa los métodos abstractos heredados addPassenger y removePassenger.

  
- Implementa una clase BusinessFlight que amplía Flight e implementa los métodos abstractos heredados addPassenger y removePassenger.
  
- La refactorización y los cambios de la API se propagan a la implementacion de las pruebas. ¿Cómo?.

  
¿Cuál es el código de cobertura ahora?. ¿Ayudó la refactorización a la mejor calidad de código?


----

**Fase 3**

Implementa nuevas funciones requeridas por el cliente que amplían las políticas de la aplicación.
Las primeras características nuevas son un nuevo tipo de vuelo, premium, y políticas relacionadas con este tipo de vuelo. Existe una política para agregar un pasajero: si el pasajero es VIP, el pasajero debe agregarse al vuelo premium; de lo contrario, la solicitud debe ser rechazada.
También existe una política para la eliminación de un pasajero: si se requiere, un pasajero puede ser eliminado de un vuelo.
Considera que, después de recibir el requisito para la implementación de este tercer tipo de vuelo, es hora de agrupar más las pruebas existentes utilizando la anotación JUnit 5 @Nested y luego implementar el requisito de vuelo premium de manera similar.

**Pregunta:**

Utiliza la clase AirportTest refactorizada antes de pasar al trabajo para el vuelo premium en el código desarrollado como mejora a tus resultados. Ver el codigo entregado en la evaluación.
Ejecuta las pruebas.

----


**Fase 4**

Realiza la implementación de la clase PremiumFlight y su lógica. Debes crear PremiumFlight como una subclase de Flight y sobreescribir los métodos addPassenger y removePassenger, pero actúan como stubs: no hacen nada y simplemente devuelven false. El estilo TDD de trabajo implica crear primero las pruebas y luego la lógica de negocios.

**Pregunta:**


----

**Fase 5**

Ocasionalmente, a propósito o por error, el mismo pasajero se ha agregado a un vuelo más de una vez. Esto ha causado problemas con la gestión de asientos y estas situaciones deben evitarse. Tu como desarrollado necesitas asegurarte de que cada vez que alguien intente agregar un pasajero, si el pasajero se ha agregado previamente al vuelo, la solicitud debe ser rechazada.
Esta es una nueva lógica comercial y debes implementarla al estilo TDD.
Para garantizar la unicidad de los pasajeros en un vuelo, cambia la estructura de la lista de pasajeros a un conjunto. Entonces, hace una refactorización de código que también se propagará a través de las pruebas.

**Pregunta:**

¿Cómo cambia la clase de vuelo en este contexto?.

Luego crea una nueva prueba para verificar que un pasajero solo se puede agregar una vez a un vuelo
¿Consigues una mejor cobertura de código?





