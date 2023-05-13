## PREGUNTAS TDD4
### RSP
Para ver el valor de aplicar SRP, consideremos un fragmento de código que no lo usa. El siguiente fragmento de código tiene una lista de formas que se dibujan cuando llamamos al método `draw()`: 

```
public class Shapes {
    private final List<Shape> allShapes = new ArrayList<>();
    public void add(Shape s) {
       allShapes.add(s);
  }
 public void draw(Graphics g) {
   for (Shape s : allShapes) {
        	switch (s.getType()) {
               case "textbox":
                   var t = (TextBox) s;
                    g.drawText(t.getText());
                    break;
               case "rectangle":
                   var r = (Rectangle) s;
                   for (int row = 0;
                      	row < r.getHeight();
                      	row++) {
                     g.drawLine(0, r.getWidth());
                }
        	}
        }
   }
}
```

**Pregunta** Este código tiene cuatro responsabilidades, ¿puedes indicarlas?. ¿Podemos cambiar este código para que sea más fácil agregar un nuevo tipo de forma?.

**Respuesta** No puedo porque soy bajito ,pero puedo intentarlo la clase Shapes tiene la responsabilidad de agregar un elemento tipo Shape a una lista que posee como atributo gracias al metodo **public void add(Shape s)** . Luego tiene la
responsabilidad de dibujar un grafico dependiendo si es un rectangulo o un textbox gracias al metodo **public void draw(Graphics g)** . A la vez dentro de esta funcion se encarga de analisar cada objeto del array si es un rectangulo o textbox y dibujar.


### DIP

**Pregunta:** Este código funciona bien para mantener una lista de objetos `Shape` y dibujarlos. ¿Cuál es el problema que sucede aquí?.

**Respuesta** El problema sucede que la clase shape debe de conocer sobre el tipo de objeto que quiere dibujar y esto puede causar problemas debido a esa dependencia.Por lo tanto es recomendable usar una interfaz para gracias a ella aplicar el polimorfismo de la funcion draw y evitar poder aumentar mas casos de switch si en todo caso se agregaran mas tipos de shape.

El término técnico para que una clase conozca a otra es que existe una dependencia entre ellas. La clase `Shapes` depende de las clases `TextBox` y `Rectangle`. Podemos representar eso visualmente en el siguiente diagrama de clases UML: 

![](https://github.com/kapumota/Actividades/blob/main/TDD-4/Imagenes/UML2.png)


**Pregunta:** ¿Por qué tener estas dependencias hace que trabajar con la clase `Shapes` sea más difícil?.

**Respuesta** Por que si deseamos agregar un tipo mas de shape tendriamos que agregar a la vez mas casos en el switch.

### lSP

Todas las clases que implementan `Shape` se ajustan a LSP. Esto es claro en la clase `TextBox`, como podemos ver aquí: 

```
public class TextBox implements Shape {
    private final String text;
    
   public TextBox(String text) {
      this.text = text;
       }
     @Override
      public void draw(Graphics g) {
    	g.drawText(text);
	}
}
``` 
**Pregunta:** ¿Qué sucede en el código anterior?.

**Respuesta** Vemos que las clases que impementen Shape no rompen la logica de su clase padre es decir puedo utilizar la interfaz sin problema y definir con un override una funcion para esa propia clase.

Un bloque de código se puede intercambiar con seguridad por otro si puede manejar la gama completa de entradas y proporcionar (al menos) todas las salidas esperadas, sin efectos secundarios no deseados. 

**Pregunta:** Hay algunas violaciones sorprendentes de LSP. Quizás el clásico para el ejemplo de código del ejemplo se trata de agregar una clase `Square`. En código Java, ¿deberíamos hacer que la clase Square amplíe la clase Rectangle? ¿Qué pasa con la clase Rectangle extendiendo Square?.

**Respuesta** No deberiamos ampliar la clase rectangulo con la clase square porque  haria que esta clase herede dos atributos que pueden ser diferentes y logre fallar la logica de porque fue creado esta clase cuadrado.

### OCP
