package cargables;

public class Televisor implements ICargable {
    private int voltaje;
    private String tipoPantalla;
    private boolean esInteligente;

    public Televisor(int voltaje, String tipoPantalla, boolean esInteligente) {
        this.voltaje = voltaje;
        this.tipoPantalla = tipoPantalla;
        this.esInteligente = esInteligente;
    }

    public int getVoltaje() {
        return this.voltaje;
    }

    public String getPantalla() {
        return this.tipoPantalla;
    }

    public boolean esInteligente() {
        return this.esInteligente;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.TELEVISOR;
    }

    @Override
    public String toString() {
        return "Televisor";
    }
}
