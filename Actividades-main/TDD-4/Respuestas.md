## PREGUNTAS TDD4
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


**Pregunta:** Este código funciona bien para mantener una lista de objetos `Shape` y dibujarlos. ¿Cuál es el problema que sucede aquí?.
**Respuesta** El problema sucede que la clase shape debe de conocer sobre el tipo de objeto que quiere dibujar y esto puede causar problemas debido a esa dependencia.Por lo tanto es recomendable usar una interfaz para gracias a ella aplicar el polimorfismo de la funcion draw y evitar poder aumentar mas casos de switch si en todo caso se agregaran mas tipos de shape.

El término técnico para que una clase conozca a otra es que existe una dependencia entre ellas. La clase `Shapes` depende de las clases `TextBox` y `Rectangle`. Podemos representar eso visualmente en el siguiente diagrama de clases UML: 

![](https://github.com/kapumota/Actividades/blob/main/TDD-4/Imagenes/UML2.png)


**Pregunta:** ¿Por qué tener estas dependencias hace que trabajar con la clase `Shapes` sea más difícil?.

**Respuesta** Por que si deseamos agregar un tipo mas de shape tendriamos que agregar a la vez mas casos en el switch.


