public class MemeM0 implements Sensor {
    @Override
    public String getTipo() {
        return getClass().getName();
    }

    public int getTemperatura() {
        return 100;
    }
}
