**FASE4-RESPUESTAS**

Realizaremos la implementación de la clase `PremiumFlight` y su lógica.

``` 
Debemos crear PremiumFlight como una subclase de Flight

``` 
En primera instancia definimos las funciones que retornen `false`.Para
luego ir implementando la lógica.

![img.png](img.png)

Procedemos a analizar la lógica según:

- Se agrega un pasajero a un vuelo premium, solo si es pasajeros VIP
- Cualquier tipo de pasajero puede ser eliminado de un vuelo premium.

---

Creamos la prueba para `PremiumFlightRegular`:
Considerando las políticas para este tipo de vuelo. Como
`Checha` no es Vip no debería agregarse y la lista deberia seguir
con tamaño 0. Luego al querer remover deberia dar false
porque no hay ningún elemento `Checha`. Por esto definimos la 
siguiente prueba:

![img_5.png](img_5.png)


Ejecutamos la prueba: y la prueba pasa por más que no hallamos 
implementado su lógica. Es decir su lógica comercial existe es
suficiente.

![img_6.png](img_6.png)

---

Luego creamos la prueba para `PremiumFlightVip`:
Considerando las políticas para este tipo de vuelo. Como lore es
vip entonces debe poder agregarse a la lista y también poder 
removerse. La prueba quedaría asi:

![img_7.png](img_7.png)

Ejecutamos la prueba:Efectivamente no pasa porque aun esta por defecto
que retorne falso. Falta la implementación.

![img_8.png](img_8.png)

usando TDD implementamos:


Consideraciones para `addPasenger`:

- Se agrega un pasajero a un vuelo premium, solo si es pasajeros VIP

![img_1.png](img_1.png)

Consideraciones para `removePasenger`:

- Cualquier tipo de pasajero puede ser eliminado de un vuelo premium.

![img_2.png](img_2.png)


Ejecutamos las pruebas: Pasan exitosamente.

![img_9.png](img_9.png)

Obtenemos una cobertura del 100%: Obviamente dejando al lado el main
que solo fue para el análisis de la lógica inicial.

![img_10.png](img_10.png)