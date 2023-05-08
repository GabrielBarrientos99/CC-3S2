# Caja Negra y Caja de Cristal
### Ejercicio 1

```
/**
 * Ordena una lista de enteros en orden nodecreciente Modifica la lista tal que
 * valores.get(i) <= valores.get(i+1) para todo 0<=i<valores.size()-1
 */
public static void sort(List<Integer> valores) {
    // escoge un buen algoritmo para el tamano de la lista
    if (valores.size() < 10) {
        radixSort(valores);
    } else if (valores.size() < 1000*1000*1000) {
        quickSort(valores);
    } else {
        mergeSort(valores);
    }
}
``` 
¿Cuál de los siguientes casos de prueba es probable que sean valores límite producidos por la prueba de caja de cristal?

```
valors = [ ] (lista vacia)
valores = [1, 2, 3]
valores = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
valores = [0, 0, 1, 0, 0, 0, 0]

```

```
# Tu respuesta
Para el valor = [] lista vacia . Es probable que use el algoritmo de radixSort para ordenar la lista
Para el valor = [1,2,3] .De la misma forma como no excede el tamaño a 10 ,usa el radixSort
Para valores = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] . Como el tamaño es igual a 10 usara el quickSort
Para valores = [0, 0, 1, 0, 0, 0, 0] Aqui usara el radix Sort-
Entonces paraestos casos de prueba los valores limites serian el vacio y cuando su tamaño sea 10 es decir:
valors = [ ] (lista vacia)
valores = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

```
