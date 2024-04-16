package ejercicio2;

public class VehiculoB {

    // Atributos
    public String marca;
    public String modelo;
    private String patente;

    // Constructor
    public VehiculoB() {
    }

    public VehiculoB(String patente) {
        this.patente = patente;
    }
    public VehiculoB(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    // Getters y setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

}
