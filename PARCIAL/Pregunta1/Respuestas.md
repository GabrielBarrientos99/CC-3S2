## PREGUNTA 1
Tenemos entonces el codigo con una clase base y sus subclases ,pero hay un incoveniente con LSP una de sus hijas no funciona bien
``` python
public abstract class Member {
    private final String name;
    public Member(String nombre) {
        this.name = nombre;
    }
    public abstract void joinTournament();
    public abstract void organizeTournament();
}

public class PremiumMember extends Member {
    public PremiumMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(" ");
    }

    @Override
    public void organizeTournament(){
        System.out.println(" ");
    }

}

public class VipMember extends Member {
    public FreeMember(String name) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }
    //Este método rompe LSP
    @Override
    public void organizeTournament() {
        System.out.println("...");
    }
}

public class FreeMember extends Member {
    public FreeMember(String name) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }
    //Este método rompe LSP
    @Override
    public void organizeTournament() {
        System.out.println("...");
    }
}
```
Se entiende que esta clase base va tener clases hijas ,pero una de esas clases ,que es la FreeMember ,no deberia
poder organizar Torneos por lo tanto la funcion organize Tournament no deberia estar en la clase base. Qeudando de la siguiente manera:

```python
public abstract class Member {
  private final String name;
  public Member(String nombre) {
  this.name = nombre;
  }
  public abstract void joinTournament();  
}
```
Entonces podriamos crear una interfaz que posea esa funcion que le hemos quitado.Ademas creariamos la Clase Controler que seria la que implementaria esta interfaz
Como primera solucion que podriamos dar :


```python
public interface Organizador {
    public void organizeTournament();
}

public class Controller implements Organizador {
    
    @Override
    public void organizeTournament() {
        System.out.println("...");
    }    
}
```
Luego las demas clases quedarian asi :
```python
public abstract class Member {
  private final String nombre;
  public Member(String nombre) {
  this.name = nombre;
  }
  public abstract void joinTournament();  
}
```

```python
public class PremiumMember extends Member {
    public PremiumMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament(){
        System.out.println(" ");
    }

}

public class VipMember extends Member {
    public VipMember(String name) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }    
}

public class FreeMember extends Member {
    public FreeMember(String name) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }    
}
```
Entonces ahora solo quedaria usar la clase Controller para organizar , puede haber una mejor manera de refactorizar, pero esta idea tambien soluciona la LSP.

Como segunda alternativa :
Dejariamos la clase Member sin la funcion organizeTournament
```python
public abstract class Member {
    private final String nombre;
    public Member(String nombre) {
        this.name = nombre;
    }
    public abstract void joinTournament();    
}
```
Y Habiendo creado un interfaz podemos hacer que cada subclase implemente esa interfaz ,si es que no se quiere que otra subclase como "Controller" sea la que organize Tournament, de la siguiente manera :
```python

public class PremiumMember extends Member implements Organizador {
    public PremiumMember(String nombre) {
        super(nombre);
    }
    
    @Override
    public void joinTournament() {
        System.out.println("...");
    }
    
    @Override
    public void organizeTournament() {
        System.out.println("...");
    }
}
```
Este seria un ejemplo de como deberiamos modificar si deseamos que implemente la interfaz. Analogo para la VipMember y no lo hariamos para la FreeMember que es la unica que no lo implementaria

```python
public class VipMember extends Member implements Organizador {
    public VipMember(String nombre) {
        super(nombre);
    }
    
    @Override
    public void joinTournament() {
        System.out.println("...");
    }
    
    @Override
    public void organizeTournament() {
        System.out.println("...");
    }
}

public class FreeMember extends Member {
    public FreeMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".....");
    }
    
}
```

