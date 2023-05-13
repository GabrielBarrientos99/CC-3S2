package shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
     private final Graphics graphics;
     private final List<Shape> all = new ArrayList<>();
     public void add(Shape s) {
         all.add(s);
     }
     public Shapes(Graphics graphics){
         this.graphics=graphics;
     }
     public void draw() {
             all.forEach((shape)->shape.draw(graphics));
         }

 }
