## PREGUNTA 1
Tenemos entonces el codigo con una clase base y sus subclases pero hay un incoveniente con LSP una de sus hijas no funciona bien
``` python
public abstract class Member {
    private final String nombre;
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
Se entiende que esta clase base va tener clases hijas pero una de esas clases que es la FreeMember no deberia
poder organizar Torneos por lo tanto la funcion organize Tournament no deberia estar en la clase base

```python
public abstract class Member {
  private final String nombre;
  public Member(String nombre) {
  this.name = nombre;
  }
  public abstract void joinTournament();  
}
```
Entonces podriamos quedar una interfaz
