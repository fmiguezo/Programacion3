package clase1;

public class Gato {
    // Estado - Atributos
        // public, protected, private
            // public => accesible desde cualquier parte del programa
            // private => sólo accesible desde el objeto
            // protected =>
    private double peso; // no se usa public, es mala práctica
    private String color;
    private String nombre;
    private int edad;

    // Constructor
    public Gato(String nombre, int edad) {this.nombre = nombre;
        this.edad = edad;
    }

    // Comportamiento - Métodos
    public void comer(int cantComida){
        this.peso += cantComida * 0.2;
    }

    public void jugar(int cantHoras){
        this.peso -= cantHoras * 0.25;
    }

    @Override
    public String toString() {
        return "clase1.Gato{" +
                "peso=" + peso +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
