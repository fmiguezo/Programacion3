public class Persona {
    // Atributos
    private String nombre;
    private Celular celular;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        this.celular = null;
    }

    public Persona(String nombre, Celular celular) {
        this.nombre = nombre;
        this.celular = celular;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public void llamar(Persona receptor) {
        if (receptor.celular == null){
            System.out.println(receptor.nombre + " no tiene celular. No se puede realizar la llamada.");
        } else {
            this.celular.llamar(receptor);
        }
    }

    public void finalizarLlamada(Persona receptor) {
        System.out.println("Finalizando llamada con " + receptor.nombre + ".");
        System.out.println("Nivel de bateria actual es de " + this.celular.getBateria() + " puntos.");
        if (receptor.celular.isEncendido()) {
            System.out.println("El celular de " + receptor.nombre + " sigue encendido.");
        } else {
            System.out.println("El celular de " + receptor.nombre + " está apagado.");
        }
        this.celular.cargarBateria();
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nCelular: " + this.celular.getModelo();
    }
}
