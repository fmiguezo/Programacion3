package cargables;

public class Heladera implements ICargable {
    private int voltaje;
    private boolean tieneFreezer;

    public Heladera(int voltaje, boolean tieneFreezer) {
        this.voltaje = voltaje;
        this.tieneFreezer = tieneFreezer;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public boolean getFreezer() {
        return tieneFreezer;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.HELADERA;
    }

    @Override
    public String toString() {
        return "Heladera";
    }
}
