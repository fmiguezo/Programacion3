package ejercicio8_10;

public class Persona {

    // Atributos
    //public String nombre;
    //public String apellido;
    private String nombre; // protected ?
    private String apellido; // protected ?


    // Constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos
    public String presentarse(){
        return "Hola, mi nombre es " + this.nombre + " " + this.apellido;
    }

    public String getNombreCompleto(){
        return getNombre() + " " + getApellido();
    }

    @Override
    public String toString() {
        return "nombre:'" + nombre + '\'' +
                ", apellido:" + apellido;
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
