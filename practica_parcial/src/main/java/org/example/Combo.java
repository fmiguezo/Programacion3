package org.example;

import java.util.ArrayList;

public class Combo implements Vendible {
    private String name;
    private ArrayList<Mueble> muebles;
    private double pctDescuento;

    public Combo(String name, double pctDescuento) {
        this.name = name;
        this.pctDescuento = pctDescuento;
        this.muebles = new ArrayList<Mueble>();
    }

    public Combo(String name, double pctDescuento, ArrayList<Mueble> muebles) {
        this.name = name;
        this.pctDescuento = pctDescuento;
        this.muebles = muebles;
    }

    public void agregarMueble(Mueble mueble) {
        muebles.add(mueble);
    }

    public void quitarMueble(Mueble mueble) {
        muebles.remove(mueble);
    }

    public double getPrecio() {
        double precio = 0;
        for (Mueble mueble : muebles) {
            precio += mueble.getPrecio();
        }
        return precio * (1 - pctDescuento);

        //return muebles.stream().mapToDouble(m -> m.getPrecio()).sum() * (1 - pctDescuento);
    }

    public String listarMuebles() {
        String lista = "";
        for (Mueble mueble : muebles) {
            lista += mueble + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return name + " - $" + getPrecio() + ":\n" + listarMuebles();
    }
}
