public class Robot {
    private String numeroSerie;
    private int potenciaTraccionBase;
    private int potenciaTraccionFinal;
    private Traccion traccion;

    public Robot(String numeroSerie, int potenciaTraccionBase, Traccion traccion) {
        this.numeroSerie = numeroSerie;
        this.potenciaTraccionBase = potenciaTraccionBase;
        this.traccion = traccion;
        this.potenciaTraccionFinal = this.potenciaTraccionBase - traccion.restarPotencia();
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public int getPotenciaTraccionBase() {
        return this.potenciaTraccionBase;
    }

    public int getPotenciaTraccionFinal() {
        return this.potenciaTraccionFinal;
    }

    public int getDistanciaMaxima() {
        return this.traccion.getDistanciaMaxima();
    }

    public String getTipoTraccion() {
        return this.traccion.getTipo();
    }

    @Override
    public String toString() {
        return  "Número de serie: " + numeroSerie + '\n' +
                "Potencia de traccion base: " + potenciaTraccionBase + "hp" + '\n' +
                "Tipo de tracción: " + traccion.getTipo() + '\n' +
                "Potencia de traccion final: " + potenciaTraccionFinal + "hp" + '\n' +
                "Distancia máxima antes de reemplazo de tracción: " + traccion.getDistanciaMaxima() + "km";
    }
}
