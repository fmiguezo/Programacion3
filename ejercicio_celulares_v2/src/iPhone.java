public class iPhone extends Modelo {

    @Override
    public String getNombre() {
        return "iPhone 11 Pro Max";
    }

    @Override
    public String getMarca() {
        return "iPhone";
    }

    @Override
    public Double getBateria() {
        return 5.0;
    }

    @Override
    public Double getDescarga() {
        return getBateria() * 0.01;
    }
}
