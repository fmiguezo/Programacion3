public class BrazoRobotico implements IHerramientas {
    private static final int PESO = 500;

    @Override
    public int getPeso() {
        return PESO;
    }

    @Override
    public String getNombre() {
        return "Brazo robótico";
    }
}
