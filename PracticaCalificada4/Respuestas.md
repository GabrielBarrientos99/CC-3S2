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










