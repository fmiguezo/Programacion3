package ejercicio3;

public class Articulo {

    // Atributos
    private String marca;
    private String modelo;

    // Constructor

    public Articulo() {
    }

    public Articulo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
