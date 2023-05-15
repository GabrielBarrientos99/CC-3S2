## Pregunta 4 (6 puntos)

(a) ¿Qué son las pruebas efectivas y sistemáticas? Referencia:

Existen pruebas que siguen de un enfoque intuitivo ,pero eso depende de la persona o ingeniero que hace la prueba,Por ejemplo los ingenieros Seniors y los ingenieron msa jovenes por si decirlo no podrian tener un enfoque asi de efectivo.

Entonces la idea de las pruebas efectivas y sistematicas es deafiar esa idea. Muestra como puedes seguir pasos sistemticos para generar casos de prueba para cualquier persona ,tenga o no mucha eperiencia o un enfoque intuitvo.

Esto consta de 4 pasos principales :

- Comensar por los requisitos del programa
- utilizar pruebas estructurales y la cobertura de codigo
- explorar posibles propiedades
- Burlarse de unidades complejas con dependencias
- Si no se puede utilizar pruebas unitarias , ir a  las pruebas de integracion

En conclusion se propone la idea de ser sistematico para lograr la efectividad o equipararse a esta.


(b) Pruebas (2 puntos)

Dividir una cadena en un caracter delimitador

parametro1 - texto -> una cadena
parametro2 - delimitador -> delimitador por el cual dividir la cadena
parametro3 - limite -> limite superior en el numero de elementos a devolver

entonces la funcion : public static List<String> split(String text, char delim, int limit)
    va retornar [s1 ,s2 ,s3 , ... , sN] ; Donde N <=limite , siempre qe limite es > 0
    
Entonces aqui podemos analizar que sucede si ingreso como parametro limite < 0 
Ejmp :  split("abc.er.s", ".", 0)                                

``` python
public static List<String> split(String text, char delim, int limit){
    
}
``` 

(a) Comienza a implementar una estrategia de prueba sistemática para esta función
escribiendo una buena partición del espacio de entrada solo en el límite de entrada, es
decir, la partición no debe mencionar ni el texto ni el delimitador.



(b) Ahora, escriba una buena partición del espacio de entrada sobre la relación entre el
límite y las ocurrencias del delimitador en el texto. Tu partición debe mencionar las tres
entradas.
