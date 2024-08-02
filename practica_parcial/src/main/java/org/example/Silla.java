package org.example;

public class Silla extends Mueble {
    private boolean tieneTapizado;
    private Tapizado tapizado;

    public Silla(double alto, double largo, double ancho, String color, double precio, boolean tieneTapizado) {
        super(alto, largo, ancho, color, precio);
        this.tieneTapizado = tieneTapizado;
    }

    public Silla(double alto, double largo, double ancho, String color, double precio, boolean tieneTapizado, Tapizado tapizado) {
        this(alto, largo, ancho, color, precio, tieneTapizado);
        this.tapizado = tapizado;
    }

    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public String toString() {
        return "Silla: \n" + super.toString() + "\nTapizado: " + tapizado;
    }
}
