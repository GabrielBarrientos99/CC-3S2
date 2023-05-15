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