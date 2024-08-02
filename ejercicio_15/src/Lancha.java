public class Lancha extends Navio {
    /*
    * - double maniobrabilidad;
    - Grua grua;

    '+ constructor (String nombre, double flotabilidad, double estabilidad, double maniobrabilidad, Grua grua);
    + double getManiobrabilidad();
    * */

    private double maniobrabilidad;
    private Grua grua;

    public Lancha() {
        super();
        this.maniobrabilidad = 0;
        this.grua = new Grua();
    }

    public Lancha(String nombre) {
        super(nombre);
        this.maniobrabilidad = 0;
        this.grua = new Grua();
    }

    public Lancha(String nombre, double flotabilidad, double estabilidad, double maniobrabilidad) {
        super(nombre, flotabilidad, estabilidad);
        this.maniobrabilidad = maniobrabilidad;
    }

    public double getManiobrabilidad() {
        return maniobrabilidad;
    }

    public Grua getGrua() {
        return grua;
    }

    public void setGrua(Grua grua) {
        this.grua = grua;
    }

    public void arriar(Object carga) {
        grua.arriar(carga);
    }

    public void setManiobrabilidad(double maniobrabilidad) {
        this.maniobrabilidad = maniobrabilidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Maniorabilidad: " + maniobrabilidad + "\n";
    }
}
