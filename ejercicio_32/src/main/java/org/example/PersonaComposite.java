package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonaComposite extends Persona {
    private List<Persona> hijos = new ArrayList<>();

    public void agregarHijo(Persona hijo) {
        hijos.add(hijo);
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        for (Persona hijo : hijos) {
            hijo.imprimirDatos();
        }
    }
}
