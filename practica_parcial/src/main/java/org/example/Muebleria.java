package org.example;

import java.util.ArrayList;

public class Muebleria {
    private ArrayList<Mueble> muebles = new ArrayList<Mueble>();
    private ArrayList<Combo> combos = new ArrayList<Combo>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void gestionarPedido(Pedido pedido) {
        System.out.println("El precio total del pedido es: " + pedido.calcularPrecioTotal());
        System.out.println("Los items del pedido son: ");
        pedido.mostrarItems();
        System.out.println("El pedido ha sido gestionado.");
    }

    public void agregarMueble(Mueble mueble) {
        muebles.add(mueble);
    }

    public void agregarCombo(Combo combo) {
        combos.add(combo);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarMueble(Mueble mueble) {
        muebles.remove(mueble);
    }

    public void eliminarCombo(Combo combo) {
        combos.remove(combo);
    }

    public void eliminarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
}
