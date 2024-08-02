public class Dron {
    private int pesoNoPenalizable;
    private double velocidadBase;
    private double alturaBase;
    private SistemaMontaje sistemaMontaje;

    public Dron(double velocidad, double altura, SistemaMontaje sistemaMontaje, int pesoNoPenalizable) {
        this.velocidadBase = velocidad;
        this.alturaBase = altura;
        this.sistemaMontaje = sistemaMontaje;
        this.pesoNoPenalizable = pesoNoPenalizable;
    }

    public String getHerramientas() {
       return sistemaMontaje.getHerramientas();
    }

    public int getPesoHerramientas(){
        return sistemaMontaje.getPeso();
    }

    public double getVelocidadMaxima() {
        if (sistemaMontaje.getPeso() < this.pesoNoPenalizable) {
            return this.velocidadBase;
        } else {
            int pesoPenalizable = sistemaMontaje.getPeso() - this.pesoNoPenalizable;
            return this.velocidadBase - (0.02 * pesoPenalizable / 50);
        }
    }

    public double getAlturaMaxima() {
        if (sistemaMontaje.getPeso() < this.pesoNoPenalizable) {
            return this.alturaBase;
        } else {
            int pesoPenalizable = sistemaMontaje.getPeso() - this.pesoNoPenalizable;
            return this.velocidadBase - (0.05 * pesoPenalizable / 50);
        }
    }

    public void agregarHerramienta(IHerramientas herramienta) {
        sistemaMontaje.agregarHerramienta(herramienta);
    }

    public void quitarHerramienta(IHerramientas herramienta) {
        sistemaMontaje.quitarHerramienta(herramienta);
    }

    @Override
    public String toString() {
        return "Dron: " +
                "Velocidad: " + this.getVelocidadMaxima() + "mts/s" +"\n" +
                "Altura: " + this.getAlturaMaxima() + "mts" + "\n" +
                "Herramientas: " + sistemaMontaje.getHerramientas();
    }
}
