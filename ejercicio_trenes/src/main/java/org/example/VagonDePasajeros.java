package org.example;

public class VagonDePasajeros extends Vagon {
    private double largo;
    private double anchoUtil;

    public VagonDePasajeros(double largo, double anchoUtil) {
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }

    @Override
    public int calcularMaximoPasajeros() {
        return (this.anchoUtil <= 2.5 ? 8 : 10) * (int) this.largo;
    }

    @Override
    public int calcularPesoMaximo() {
        return this.calcularMaximoPasajeros() * 80;
    }
}
