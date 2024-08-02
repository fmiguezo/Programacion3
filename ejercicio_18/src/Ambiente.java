public class Ambiente {
    private TipoAmbiente tipo;
    private double superficie;
    private boolean esLuminoso;

    public Ambiente(TipoAmbiente tipo, double superficie, boolean esLuminoso) {
        this.tipo = tipo;
        this.superficie = superficie;
        this.esLuminoso = esLuminoso;
    }

    public TipoAmbiente getTipo() {
        return tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean esLuminoso() {
        return esLuminoso;
    }
}
