package org.example;

public class Mesa extends Mueble {
    private int cantidadDePatas;
    private Material material;
    private Forma forma;

    public Mesa(double alto, double largo, double ancho, String color, double precio, int cantidadDePatas, Material material, Forma forma) {
        super(alto, largo, ancho, color, precio);
        this.cantidadDePatas = cantidadDePatas;
        this.material = material;
        this.forma = forma;
    }

    public double getPrecio() {
        return super.getPrecio();
    }

    public String toString() {
        return "Mesa " + forma + " de " + material + " con " + cantidadDePatas + " patas. \n" + super.toString();
    }
}
