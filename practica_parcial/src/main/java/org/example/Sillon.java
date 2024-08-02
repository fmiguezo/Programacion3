package org.example;

public class Sillon extends Mueble {
    private Tapizado tapizado;

    public Sillon(double alto, double largo, double ancho, String color, double precio, Tapizado tapizado) {
        super(alto, largo, ancho, color, precio);
        this.tapizado = tapizado;
    }

    public double getPrecio() {
        return super.getPrecio();
    }

    public String toString() {
        return "Sillon: " + super.toString() + ". Tapizado: " + tapizado;
    }
}
