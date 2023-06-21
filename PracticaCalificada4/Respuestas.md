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

----------------------------
T1 :  countClumps([1, 1, 1, 1, 1]) → 1

T2 :  countClumps([1, 1, 2, 1, 1]) → 2

T3 :  countClumps([1, 2, 3]) → 0	

----------------------------
T4 :  countClumps(null) → 0

T5 :  countClumps([]) → 0

----------------------------

Pregunta 3 (2 puntos) Anota estas tres pruebas como casos de prueba automatizados (JUnit) y ejecuta la
herramienta de cobertura de código favorita. Muestra los resultados

Entonces inicialmente tenemos lo siguiente, lo sobreescribí en la actividad de pruebas estructurales, pero hice 
una implementacion a mi lógica:


```python

public class Clumps {
    /**
     * Un clump es una secuencia del mismo elemento con a sequence of
     *  una longitud de al menos 2.     *
     * @param nums
     * @precond : nums != null y nums.length>0
     * @potcond : numClumps ,
     * Si se viola una precondicion returns 0
     *
     */
    public static int countClumps(int[] nums) {

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
}

```

Como podemos notar las precondiciones no estan verificadas en el codigo ,debido a que en primer lugar,
te pidió implementar sin los requisitos.Entonces me va salir error en los casos de prueba LIMITES.

```python

class ClumpsOnlyStructuralTest {
    @ParameterizedTest
    @MethodSource("generator")
    void testClumps(int[] nums, int expectedNoOfClumps) {
        assertThat(Clumps.countClumps(nums))
                .isEqualTo(expectedNoOfClumps);
    }

    static Stream<Arguments> generator() {
        return Stream.of(
                of(new int[]{1,1,1,1,1}, 1), //T1
                of(new int[]{1,1,2,1,1}, 2), // T2
                of(new int[]{1,2,3}, 0), // T3
                // Pruebas limites adicionales
                of(null, 0),
                of(new int[]{}, 0)
        );
    }

}
```

![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/8bfbd5de-7584-4f2b-a8d0-0348da4a324c)

Aplicamos la covertura de Jacoco

![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/cc424bbd-bbe5-4d5e-9943-770218b3cc4d)

Notamos que el branch aun sigue en 87%. Por lo que falta solventar los casos limites:

Reimplementamos :


```python

public class Clumps {
    /**
     * Un clump es una secuencia del mismo elemento con a sequence of
     *  una longitud de al menos 2.     *
     * @param nums
     * @precond : nums != null y nums.length>0
     * @potcond : numClumps ,
     * Si se viola una precondicion returns 0
     *
     */
    public static int countClumps(int[] nums) {
        if(nums==null || nums.length ==0) return 0;
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
}

```
Le añadimos esta linea de codigo donde verificamos las precondiciones 
![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/09e7a6db-92bf-4ef1-9659-c0899074febb)


![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/af27b9cf-1fb6-4df8-a94c-ae59cd59f097)

Cobertura :

![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/51d62fc4-cda1-4b40-ae67-80d3bb4cd9ae)

Segun la herramiento de ayuda proporcionada cumple ademas otros casos:

![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/e5ba4df0-f6dd-4545-887e-db56da843364)


Pregunta 4 (3 puntos) En la resolución de las preguntas dadas anteriorermente se pierde muchos casos de
prueba interesantes. Incluso sin realizar pruebas de especificación sistemáticas, en un programa que cuenta
clumps, es natural probar el programa con varios clumps en lugar de uno solo. Experimenta con el último
clump en el último elemento del arreglo o con un conjunto que tiene un clump que comienza en la primera
posición. ¿Qué pasa con el código cobertura de ramas?.

Veamos .Entonces Sea T6 y T7 :

T6 :  countClumps([1, 2, 3, 3]) → 1

T7 :  countClumps([1, 1, 2, 3, 4]) → 1

Añadimos el T6 Y T7:

![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/0c142630-9863-4c88-a609-f0329210a90e)

Cobertura:
![imagen](https://github.com/GabrielBarrientos99/CC-3S2/assets/129352498/b0b6d2c9-2218-4b2d-aad9-a4a5af6fc905)

La cobertura sigue siendo la misma porque ya habia realizado pruebas similares en los t1-t3.



