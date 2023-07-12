**Fase 1**

Para crear una aplicación confiable y poder comprender e implementar la lógica comercial de manera
fácil y segura, se considera cambiar la aplicación al enfoque TDD.

**Pregunta:**
Sigue la lógica comercial para un vuelo comercial y traduce eso escribiendo una prueba llamada
AirportTest. ¿Cuáles son los resultados de las pruebas con cobertura obtenidad?
¿Puedes indicar algunas conclusiones de lo anterior, necesitamos refactorizar?

**Respuesta**

Vemos que en un principio nos sale error Debido a que la clase EconomyFlight no esta creada
![img.png](img.png)

De la misma forma para la clase de BusinessFlight
![img_1.png](img_1.png)

Como en un principio se crea el objeto economyFlight como una instancia de la clase Flight y luego se procede
 a igualar a la instancia de otra clase entonces esto denota el uso de polimorfismo.

![img_2.png](img_2.png)

Entonces tomemos como cada una de las prueba que queremos hacer como vacias y en un principio
sin refactorizar solo instanciamos un objeto de tipo Flight de la siguiente manera.

![img_3.png](img_3.png)

![img_6.png](img_6.png)

Tanto para un vuelo de tipo economico como para un vuelo business


Vemos que todas las pruebas pasan.Al inicio sin definir aun las pruebas.
![img_7.png](img_7.png)

Obteniendo una cobertura de 0% inicial
![img_8.png](img_8.png)
