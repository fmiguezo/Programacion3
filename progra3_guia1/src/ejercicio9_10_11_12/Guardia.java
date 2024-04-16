package ejercicio9_10_11_12;

import ejercicio8_10.Persona;

public class Guardia extends Persona {
    // Constructor
    public Guardia() {

    }
    public Guardia(String juan, String perez) {
    }

    // Métodos
    @Override
    public String presentarse() {
        return super.presentarse() + " y soy el guardia.";
    }

    public String controlarDocumento(String dni){
        return "Adelante persona con dni " + dni;
    }
    public String controlarDocumento(String nombre, String dni){
        return "Adelante " + nombre + " con dni " + dni;
    }
}
