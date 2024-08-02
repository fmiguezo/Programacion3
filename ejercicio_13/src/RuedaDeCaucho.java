public class RuedaDeCaucho implements Traccion {
    @Override
    public int restarPotencia() {
        return 1;
    }

    @Override
    public int getDistanciaMaxima() {
        return 100;
    }

    @Override
    public String getTipo() {
        return getClass().getName();
    }
}
