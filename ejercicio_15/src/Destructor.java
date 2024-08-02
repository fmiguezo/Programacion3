public class Destructor extends NavioGuerra {
    private double maniobrabilidad;

    public Destructor() {
        this.maniobrabilidad = 0;
    }

    public Destructor(String nombre) {
        super(nombre);
        this.maniobrabilidad = 0;
    }

    public Destructor(String nombre, double flotabilidad, double estabilidad, double solidez, double potenciaDeFuego, double velocidadCrucero, double maniobrabilidad) {
        super(nombre, flotabilidad, estabilidad, solidez, potenciaDeFuego, velocidadCrucero);
        this.maniobrabilidad = maniobrabilidad;
    }

    public double getManiobrabilidad() {
        return maniobrabilidad;
    }

    public void setManiobrabilidad(double maniobrabilidad) {
        this.maniobrabilidad = maniobrabilidad;
    }
}
