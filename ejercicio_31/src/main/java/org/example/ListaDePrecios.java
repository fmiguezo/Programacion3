package org.example;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaDePrecios {
    private String nombre;
    private Date fecha;
    private List<IArticulo> articulos = new ArrayList<IArticulo>();

    public Map<IArticulo, Double> calcularPrecios() {
        Map<IArticulo, Double> precios = new HashMap<>();
        for (IArticulo articulo : articulos) {
            precios.put(articulo, articulo.calcularPrecio());
        }
        return precios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<IArticulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<IArticulo> articulos) {
        this.articulos = articulos;
    }
}
