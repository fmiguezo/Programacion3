public class Persona {
    // Atributos
    private String nombre;
    private Celular celular;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, Celular celular) {
        this(nombre);
        this.celular = celular;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    // Setters
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    // Métodos
    public void llamar(Persona receptor){
        celular.llamar(receptor);
    }

    public void recibirLlamada() {
        celular.recibir();
    }

    public void finalizarLlamada(Persona persona) {
        celular.finalizar(persona, this);
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nCelular: " + this.celular.getModelo();
    }
}
