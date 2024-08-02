public class BarcoHospital extends Navio {
    private int capacidadDeCarga;

    public BarcoHospital() {
        super();
        this.capacidadDeCarga = 0;
    }

    public BarcoHospital(String nombre){
        super(nombre);
        this.capacidadDeCarga = 0;
    }

    public BarcoHospital(String nombre, int capacidadDeCarga){
        super(nombre);
        this.capacidadDeCarga = 0;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public BarcoHospital(String nombre, double flotabilidad, double estabilidad, int capacidadDeCarga) {
        super(nombre, flotabilidad, estabilidad);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Capacidad de carga: " + capacidadDeCarga;
    }
}
