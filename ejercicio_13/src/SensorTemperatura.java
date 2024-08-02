public class SensorTemperatura implements Sensor {
    @Override
    public String getTipo() {
        return getClass().getName();
    }

    public double getTemperatura() {
        return Math.random() * 50 + 100;
    }
}
