package ejercicio8_10;

public class Visitante {
    private String nombre;
    private String apellido;


    // Constructor
    public Visitante() {
    }

    public Visitante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos


    @Override
    public String toString() {
        return "ejercicio8.Visitante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
