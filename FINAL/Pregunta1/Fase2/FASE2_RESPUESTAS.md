**FASE2-RESPUESTAS**

En esta fase vamos a **refactorizar** el código. Necesitamos crear clases hijas
que extiendan de Flight para que podamos utilizar el **polimorfismo** con estas clases. 
Y poder definir en cada una de estas clases su respectiva función: `addPassenger` y `removePassenger`

Cambiamos `addPassenger` y `removePassenger` como métodos abstractos de Light:

![img.png](img.png)

Modificamos el contructor elimiando el atributo: `flightType` que ya no es necesario.

![img_1.png](img_1.png)

Implementamos la clase EconomyFlight : ![img_2.png](img_2.png)

De manera inicial ambos retornarian falso. Luego vamos a proceder a rescatar el analisis
realizado en la fase :`Antes`.

![img_3.png](img_3.png)

Implementamos la clase BusinessFlight :![img_4.png](img_4.png)

![img_5.png](img_5.png)

Es notorio que si ejecutamos las pruebas no van a pasar debido a que no se ha implementado
la lógica de cada función en su respectivo tipo de vuelo. Por defecto todas retornan `false`.

![img_6.png](img_6.png)

---

**PROCEDEMOS A IMPLEMENTAR LA LÓGICA ANTERIOR**

Consideraciones para `addPasenger`:

- Si es `Economico` : Sin distinción lo agrega.
- Si es `Negocios` : Solo agrega si es vip

Consideraciones para `removePasenger`:

- Si es `Economico` : Lo elimina siempre y cuando no sea Vip.
- Si es `Negocios` : No elimina por ningun motivo, es mas devuelve falso.

---

Para la clase `EconomyFlight` : 

`addPasenger` : Sin distinción lo agrega

![img_7.png](img_7.png)

`removePasenger`: Lo elimina siempre y cuando no sea Vip.

![img_9.png](img_9.png)!

---

Para la clase `BusinessFlight` : 

`addPasenger` : Solo agrega si es vip

![img_10.png](img_10.png)


`removePasenger`: No elimina por ningún motivo, es mas devuelve falso.

![img_11.png](img_11.png)

---

**PROCEDEMOS A EJECUTAR LAS PRUEBAS**

Efecetivamente todas las pruebas pasan:

![img_12.png](img_12.png)

Ahora veamos la cobertura :

La cobertura de código actual después de la refactorización es del 100% para las clases hijas. Esto significa que todas las líneas de código
están siendo ejecutadas y probadas por las pruebas unitarias. Pareciera que las pruebas se hubieran desplazado
hacia las clases hijas donde poseen cada una la implementación de la lógica y la clase base ya no contienen
las posibilidades debido a que solo es una clase abstracta y no contiene la lógica.

![img_13.png](img_13.png)

