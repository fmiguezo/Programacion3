package ejercicio8_10;

public class Guardia {
    private String nombre;
    private String apellido;


    // Constructor
    public Guardia() {
    }

    public Guardia(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos


    @Override
    public String toString() {
        return "ejercicio8.Guardia{" +
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
