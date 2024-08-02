package org.example;

public class VagonDeCarga extends Vagon{
    private double cargaMaxima;

    public VagonDeCarga(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public int calcularPesoMaximo() {
        return (int) this.cargaMaxima + 160;
    }
}
