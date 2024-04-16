package ejercicio9_10_11_12;

import ejercicio8_10.Persona;

public class Visitante extends Persona {
    // Atributos
    private String dni;

    // Constructor
    public Visitante() {

    }
    public Visitante(String juan, String perez) {
    }

    // Getters y setters
    public String getDni() {
            return this.dni;
        }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
