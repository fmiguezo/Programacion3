package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mozo {
    private List<Plato> platos = new ArrayList<Plato>();

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void entregarPlatos() {
        for (Plato plato : platos) {
            plato.servir();
        }
    }
}
