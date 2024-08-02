package org.example;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Vendible> items = new ArrayList<Vendible>();

    public void agregar(Vendible item) {
        items.add(item);
    }

    public void eliminar(Vendible item) {
        items.remove(item);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vendible item : items) {
            total += item.getPrecio();
        }
        return total;
        // return items.stream().mapToDouble(Vendible::getPrecio).sum();
    }

    public void mostrarItems() {
        for (Vendible item : items) {
            System.out.println(item);
        }
    }

    public ArrayList<Vendible> getItems() {
        return items;
    }

    @Override
    public String toString() {
        String detalle = "";
        for (Vendible item : items) {
            detalle += item + "\n";
        }
        return "Pedido: " +
                "\nItems: \n" + detalle +
                "Precio total: " + calcularPrecioTotal();
        }
}
