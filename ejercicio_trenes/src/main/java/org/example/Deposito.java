package org.example;

import java.util.HashSet;

public class Deposito {
    private HashSet<Formacion> formaciones;
    private HashSet<Locotomora> locotomoras;

    public Deposito() {
        this.formaciones = new HashSet<Formacion>();
        this.locotomoras = new HashSet<Locotomora>();
    }

    public void agregarFormacion(Formacion formacion) {
        this.formaciones.add(formacion);
    }

    public void agregarLocotomora(Locotomora locotomora) {
        this.locotomoras.add(locotomora);
    }

    // 7.
    public HashSet<Vagon> obtenerConjuntoMasPesado() {
        int pesoMaximo = 0;
        Formacion formacionMasPesada = null;
        for (Formacion formacion : this.formaciones) {
            for (Vagon vagon : formacion.getVagones()) {
                if (vagon.calcularPesoMaximo() > pesoMaximo) {
                    pesoMaximo = vagon.calcularPesoMaximo();
                    formacionMasPesada = formacion;
                }
            }
        }
        return formacionMasPesada.getVagones();
    }

    // 9.
    public void agregarLocotomora(Formacion formacion, Locotomora locotomora) throws PesoDeArrasteInsuficienteException, FormacionEnMarchaException {
        formacion.estaEnMarcha();
        if (locotomora.calcularArrastreUtil() >= formacion.obtenerKilosDeEmpuje()) {
            formacion.getLocotomoras().add(locotomora);
        } else {
            throw new PesoDeArrasteInsuficienteException("El arrastre de la locotomora no es suficiente para arrastrar los vagones. No se puede agregar la locomotora.");
        }
    }
}
