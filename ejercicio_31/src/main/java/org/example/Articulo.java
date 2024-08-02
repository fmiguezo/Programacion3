package org.example;

public class Articulo implements IArticulo {
    private String nombre;
    private String codigo;
    private Double costo;

    @Override
    public Double calcularPrecio() {
        return getCosto();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
