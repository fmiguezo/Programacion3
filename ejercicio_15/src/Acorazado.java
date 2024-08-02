public class Acorazado extends NavioGuerra {
    private double blindaje;

    public Acorazado() {
        this.blindaje = 0;
    }

    public Acorazado(String nombre) {
        super(nombre);
        this.blindaje = 0;
    }

    public Acorazado(String nombre, double flotabilidad, double estabilidad, double solidez, double potenciaDeFuego, double velocidadCrucero, double blindaje) {
        super(nombre, flotabilidad, estabilidad, solidez, potenciaDeFuego, velocidadCrucero);
        this.blindaje = blindaje;
    }

    public double getBlindaje() {
        return blindaje;
    }

    public void setBlindaje(double blindaje) {
        this.blindaje = blindaje;
    }

    @Override
    public String toString() {
        return super.toString() + "Blindaje: " + blindaje + "\n";
    }

}
