**ANTES**

```
En esta sección proponemos un inicio en el que no se defina aún las pruebas
```
---
**Cuando el tipo de vuelo es `Economico`:**

- Para una persona regular con la siguiente prueba:
  
![img.png](img.png)

- Para una persona vip con la siguiente prueba:
  
![img_1.png](img_1.png)

**Cuando el tipo de vuelo es `Negocios`:**

- Para una persona regular con la siguiente prueba:

![img_2.png](img_2.png)

- Para una persona vip con la siguiente prueba:

![img_3.png](img_3.png)

---

Comprendemos cada clase: `Flight` y `Passenger` . En la clase
principal.

![img_4.png](img_4.png)

Notamos que la función addPassenger de `Flight`.Solo agrega a la
lista de la siguiente forma :

- Si es `Economico` : Sin distinción lo agrega.
- Si es `Negocios` : Solo agrega si es vip

![img_5.png](img_5.png)

`Passenger` contiene 2 atributos, el nombre y su estado de Vip.

![img_6.png](img_6.png)


---
Notamos que la función removePassenger de `Flight`.

- Si es `Economico` : Lo elimina siempre y cuando no sea Vip.
- Si es `Negocios` : No elimina por ningun motivo, es mas devuelve falso.

![img_7.png](img_7.png)

---
Teniendo estas consideraciones en cuenta, en la funcion principal Airport cuando ejecutamos.
Creamos primero dos pasajeros:
- Checha : vip = true
- Lore : vip = false

![img_8.png](img_8.png)

1.- Cuando se llame a la función: `bussinessFlight.addPassenger(checha)` Como es `Negocios` y es Vip lo va agregar
a su lista porque es Vip.

2.- Cuando se llame a la función: `bussinessFlight.removePassenger(checha)` como es `Negocios` , no va eliminar y retorna `false`

3.- Cuando se llame a la función: `bussinessFlight.addPassenger(lore)` como es `Negocios` y no es vip. No la va a agregar.

4.- Cuando se llame a la función: `economyFlight.addPassenger(lore)` como es `Economico` va agregarlo a su lista.

Al ejecutar efectivamente vemos que tenemos dos listas con `Checha` y `Lore` en cada una de ellas.

![img_9.png](img_9.png)
