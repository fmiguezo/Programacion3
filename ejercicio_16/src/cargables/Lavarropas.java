package cargables;

public class Lavarropas implements ICargable {
    private int voltaje;
    private int carga;
    private int revolucionesCentrifugado;

    public Lavarropas(int voltaje, int carga, int revolucionesCentrifugado) {
        this.voltaje = voltaje;
        this.carga = carga;
        this.revolucionesCentrifugado = revolucionesCentrifugado;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public int getCarga() {
        return carga;
    }

    public int getCentrifugado() {
        return revolucionesCentrifugado;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.LAVARROPAS;
    }

    @Override
    public String toString() {
        return "Lavarropas";
    }
}
