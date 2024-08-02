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

    public void getBateriaCelular() {
        try {
            System.out.println("Batería: " + celular.getBateria() + " puntos.");
        } catch (NullPointerException e) {
            System.out.println("No se puede obtener el estado de la batería. " + this.nombre + " no tiene celular.");
        }
    }

    public void getEstadoCelular() {
        try {
            if(celular.isEncendido()) {
                System.out.println("El celular de " + this.nombre + " está encendido.");
            } else {
                System.out.println("El celular de " + this.nombre + " está apagado.");
            }
        } catch (NullPointerException e) {
            System.out.println("No se puede obtener el estado del celular. " +this.nombre + " no tiene celular.");
        }
    }

    public void encenderCelular() {
        try {
            celular.encender();
        } catch (NullPointerException e) {
            System.out.println(this.nombre + " no tiene celular.");
        }
    }

    public void apagarCelular() {
        try {
            celular.apagar();
        } catch (NullPointerException e) {
            System.out.println(this.nombre + " no tiene celular.");
        }
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
