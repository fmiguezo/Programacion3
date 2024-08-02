public class Oruga implements Traccion {
    private SensorTemperatura mekem0;

    @Override
    public int restarPotencia() {
        return 3;
    }

    @Override
    public int getDistanciaMaxima() {
        return 400;
    }

    @Override
    public String getTipo() {
        return getClass().getName();
    }

    public String getSensor() {
        return this.mekem0.getTipo();
    }

    public double getTemperatura() {
        return this.mekem0.getTemperatura();
    }
}
