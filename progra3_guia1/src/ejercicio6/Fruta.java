package ejercicio6;

public class Fruta {
    // Atributos
    private String color;
    private double peso;
    private boolean esEstacional;

    // Constructor
    public Fruta() {
    }

    public Fruta(String color, double peso, boolean esEstacional) {
        this.color = color;
        this.peso = peso;
        this.esEstacional = esEstacional;
    }

    // Métodos
    public boolean esComestible(){

        return this.peso < 200 && this.esEstacional;
    }

    @Override
    public String toString() {
        return "ejercicio6.Fruta{" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                ", esEstacional=" + esEstacional +
                '}';
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEsEstacional() {
        return esEstacional;
    }

    public void setEsEstacional(boolean esEstacional) {
        this.esEstacional = esEstacional;
    }
}
