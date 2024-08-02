public abstract class NavioGuerra extends Navio {
    private double solidez;
    private double potenciaDeFuego;
    private double velocidadCrucero;

    public NavioGuerra() {
        super();
        this.solidez = 0;
        this.potenciaDeFuego = 0;
        this.velocidadCrucero = 0;
    }

    public NavioGuerra(String nombre) {
        super(nombre);
        this.solidez = 0;
        this.potenciaDeFuego = 0;
        this.velocidadCrucero = 0;
    }

    public NavioGuerra(String nombre, double flotabilidad, double estabilidad, double solidez, double potenciaDeFuego, double velocidadCrucero) {
        super(nombre, flotabilidad, estabilidad);
        this.solidez = solidez;
        this.potenciaDeFuego = potenciaDeFuego;
        this.velocidadCrucero = velocidadCrucero;
    }

    public double getSolidez() {
        return solidez;
    }

    public double getPotenciaDeFuego() {
        return potenciaDeFuego;
    }

    public double getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setSolidez(double solidez) {
        this.solidez = solidez;
    }

    public void setPotenciaDeFuego(double potenciaDeFuego) {
        this.potenciaDeFuego = potenciaDeFuego;
    }

    public void setVelocidadCrucero(double velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    @Override
    public String toString() {
        return super.toString() + "Solidez: " + solidez + "\n" + "Potencia de fuego: " + potenciaDeFuego + "\n" + "Velocidad de crucero: " + velocidadCrucero + "\n";
    }
}
