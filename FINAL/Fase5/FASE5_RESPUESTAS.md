**FASE5-RESPUESTAS**

Como ha ocurrido un problema cuando un pasajero se ha agregado dos veces.
Necesitamos implementar o mejor dicho solucionar este error en el método de addPasenger.


- Característica a agregar:

```
Cada que se quiera añadir a algun pasajero que ya esta en lista. 
Se rechaza la solicitud.
```

---

Creamos nuestra prueba con estas caracteristicas. 
Esta prueba está en la clase: 
- class:`EconomyFlightTest` -> class :`RegularPassenger` .Es decir es una prueba para un tipo de vuelo
  `Economico` y un pasajero `Regular`.

![img.png](img.png)

**Ejecutamos la prueba:** Falla. Por lo tanto, falta implementar.
![img_1.png](img_1.png)

ANTES : 

![img_2.png](img_2.png)

DESPUÉS:

![img_3.png](img_3.png)

**Ejecutamos la prueba:** Pasa la prueba exitosamente.

![img_4.png](img_4.png)

---

Creamos nuestra prueba con estas caracteristicas. Ahora para cuando sea Vip , en Economico.
Esta prueba está en la clase:
- class:`EconomyFlightTest` -> class :`VipPassenger` .Es decir es una prueba para un tipo de vuelo
  `Economico` y un pasajero `Vip`.
Utilizamos a Lore porque es Vip y la agregamos dos veces :

![img_5.png](img_5.png)

**Ejecutamos la prueba:** Pasó. Por lo tanto, la implementación es suficiente. (La prueba esta demás)

![img_6.png](img_6.png)

---

**ANALOGO HACEMOS PARA LAS DEMÁS :** `BusinessFlightTest` y `PremiumFlightTest`


![img_8.png](img_8.png)

FALLA : 
![img_9.png](img_9.png)

Implementamos : Añadimos lo rojo
![img_10.png](img_10.png)

**Ejecutamos la prueba:** Y no pasa. Porque en realidad según las politicas anteriores
un pasajero en tipo de avion Negocios  no se puede añadir si no es Vip por lo tanto.
No peude haber repeticion de no Vips. Se descarta la prueba. 

![img_11.png](img_11.png)


Seguimos ahora para un Vip en Tipo de avion : Business.

![img_12.png](img_12.png)

**Ejecutamos la prueba:** Pasó por la implementación anterior. Si en caso lo hubiera descartado.
De primera instancia la prueba anterior. En esta de aquí tendríamos un Rojo - verde también.

![img_13.png](img_13.png)

---
Seguimos por último para la última clase : `PremiumFlightTest`

Creamos la prueba:
![img_14.png](img_14.png)

**Ejecutamos la prueba:**: No pasa .Necesita implementación.

![img_15.png](img_15.png)

Parecida a lo anterior: no es posible repetir dos pasajeros regulares porque por condición.
Solo se puede añadir si es Vip. Asi que nos ahorramos la implementacion para esta prueba y lo
ponemos como comentario.

Escribimos la prueba para cuando es Vip y de tipo Premium:

![img_17.png](img_17.png)
**Ejecutamos la prueba:**:Falla.

Implementamos:
![img_16.png](img_16.png)

**Ejecutamos la prueba:**:

![img_18.png](img_18.png)


**FINALMENTE VEAMOS LA COBERTURA:** Obtuvimos una 
cobertura del 100% porque abarcamos todos los escenarios
y rutas de ejecución posibles.

![img_19.png](img_19.png)


