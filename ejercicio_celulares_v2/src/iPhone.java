public class iPhone implements Modelo {
    @Override
    public Double getBateria() {
        return 5.0;
    }

    @Override
    public Double getDescarga() {
        return getBateria() * 0.01;
    }
}
