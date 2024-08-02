package org.example;

import java.util.HashMap;
import java.util.Map;

public class Promocion implements IArticulo {
    private String nombre;
    private Double porcentajeDescuento;
    private Map<Articulo, Integer> cantidades = new HashMap<>();

    @Override
    public Double calcularPrecio() {
        Double precio = 0.0;
        for (Map.Entry<Articulo, Integer> entry : cantidades.entrySet()) {
            precio += entry.getKey().calcularPrecio() * entry.getValue();
        }
        return precio * (1 - porcentajeDescuento);
    }

    public void agregarArticulo(Articulo articulo, Integer cantidad) {
        cantidades.put(articulo, cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Map<Articulo, Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(Map<Articulo, Integer> cantidades) {
        this.cantidades = cantidades;
    }
}
