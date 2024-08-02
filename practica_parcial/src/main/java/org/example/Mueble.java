package org.example;

public abstract class Mueble implements Vendible {
    private double alto;
    private double largo;
    private double ancho;
    private String color;
    private double precio;

    public Mueble(double alto, double largo, double ancho, String color, double precio) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Medidas: " + alto + "x" + largo + "x" + ancho + ". Color: " + color + ". Precio: " + precio;
    }
}
