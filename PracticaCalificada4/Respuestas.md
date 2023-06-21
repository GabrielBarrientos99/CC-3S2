Prueba 1(8 puntos)

Sea el ejemplo "contar clumps", inspirado en una tarea de CodingBat: https://codingbat.com/prob/p193817):
El programa debe contar el número de clumps en un arreglo. Un clumps es una secuencia del mismo elemento
con una longitud de al menos 2.

Precondiciones : nums != null y nums.length>0

Postcondiciones : numClumps ,
Si se viola una precondicion returns 0


```python
public int countClumps(int[] nums) {
  int numClumps = 0;
  for (int i=0;i<nums.length;i++)
  {

  }
  
}
```

Pregunta 1 (2 puntos)

Escribe una implementación del problema dado
Supongamos que decidimos no mirar los requisitos. Queremos lograr, digamos, el 100% de cobertura de
ramas.

  Escribiendo una implementacion tendriamos lo siguiente sin mirar los requisitos:

```python

public int countClumps(int[] nums) { 
  
  int numClumps = 0;
  int v1 = nums[0];
  boolean bandera = false;
  for (int i=1;i<nums.length;i++)
  {
     if(nums[i]!=v1)
     {
        v1=nums[i];
        bandera = false;
        
     }else if(nums[i]==v1 && bandera == false ){
      numClumps++;
      bandera =true;
     }
  }
  return numClumps;

}

```


**Pregunta 2 (1 puntos) Escribe tres pruebas para hacer eso (T1-T3). También agrega algunas pruebas de
límites adicionales (T4)**

Parametros : `nums`
  - `Null`
  - Cadena vacía
  - Cadena no vacía

**Hay varios límites:**

T1 : 'nums' tiene 1 Clumps

T2 : 'nums' tiene 2 Clumps

T3 : 'nums' tiene 0 Clumps


**Pruebas limites adicionales:**

T4 : `nums` es `null`

T5 : `nums` es `vacio`






Pregunta 3 (2 puntos) Anota estas tres pruebas como casos de prueba automatizados (JUnit) y ejecuta la
herramienta de cobertura de código favorita. Muestra los resultados
