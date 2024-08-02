public class SensorInfrarrojo implements IHerramientas {
    private static final int PESO = 250;

    @Override
    public int getPeso() {
        return PESO;
    }

    @Override
    public String getNombre() {
        return "Sensor infrarrojo";
    }
}
