public class Taser implements IHerramientas {
    private static final int PESO = 300;

    @Override
    public int getPeso() {
        return PESO;
    }

    @Override
    public String getNombre() {
        return "Taser";
    }
}
