package ejercicio3;

public class ArticuloB {

    // Atributos
    private String marca;
    private String modelo;

    // Constructor

    public ArticuloB() {
    }

    public ArticuloB(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos

    @Override
    public String toString() {
        return "Articulo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
