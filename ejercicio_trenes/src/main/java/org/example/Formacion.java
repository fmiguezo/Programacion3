package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Formacion {
    private HashSet<Locotomora> locomotoras;
    private HashSet<Vagon> vagones;
    private EstadoFormacion estado;

    public Formacion() {
        this(new HashSet<Vagon>());
    }

    public Formacion(HashSet<Vagon> vagones) {
        this.vagones = vagones;
        this.locomotoras = new HashSet<Locotomora>();
        this.estado = EstadoFormacion.EN_DEPOSITO;
    }

    public HashSet<Locotomora> getLocotomoras() {
        return locomotoras;
    }

    public HashSet<Vagon> getVagones() {
        return vagones;
    }

    public EstadoFormacion getEstado() {
        return estado;
    }

    public void agregarVagon(Vagon vagon) throws FormacionEnMarchaException {
        this.estaEnMarcha();
        this.vagones.add(vagon);

    }

    public int obtenerKilosDeEmpuje() {
        /*
        int kilosDeEmpuje = 0;
        for (Vagon vagon : this.vagones) {
            kilosDeEmpuje += vagon.calcularPesoMaximo();
        }
        return kilosDeEmpuje;
        */
        return this.vagones.stream().mapToInt(vagon -> vagon.calcularPesoMaximo()).sum();
    }

    public boolean estaEnMarcha() throws FormacionEnMarchaException {
       if (this.estado != EstadoFormacion.EN_MARCHA){
           return false;
       } else {
           throw new FormacionEnMarchaException("No se puede agregar una locotomora a una formación en marcha.");
       }
    }

    // 1.
    public int calcularMaximoPasajeros() {
        /*
        int totalPasajeros = 0;
        for (Vagon vagon : this.vagones) {
            totalPasajeros += vagon.calcularMaximoPasajeros();
        }
        return totalPasajeros;
        */
        return this.vagones.stream().mapToInt(vagon -> vagon.calcularMaximoPasajeros()).sum();
    }

    // 2.
    public int obtenerTotalVagonesLivianos() {
        /*
        int totalVagonesLivianos = 0;
        for (Vagon vagon : this.vagones) {
            if (vagon.calcularPesoMaximo() < 2500) {
                totalVagonesLivianos++;
            }
        }
        return totalVagonesLivianos;

         */
        return (int) this.vagones.stream().filter(vagon -> vagon.calcularPesoMaximo() < 2500).count();
    }

    // 3.
    public double obtenerVelocidadMaxima() {
        /*
        if (locomotoras.isEmpty()) {
            return 0;
        } else {
            double velocidadMaxima = locomotoras.stream().findFirst().get().getVelocidadMaxima();
            for (Locotomora locotomora : locomotoras) {
                if (locotomora.getVelocidadMaxima() < velocidadMaxima) {
                    velocidadMaxima = locotomora.getVelocidadMaxima();
                }
            }
            return velocidadMaxima;
        }
        */
        return locomotoras.stream().mapToDouble(Locotomora::getVelocidadMaxima).min().orElse(0);
    }

    // 4.
    public boolean esEficiente() {
        /*
        if (locomotoras.isEmpty()) {
            return false;
        } else {
            for (Locotomora locotomora : locomotoras) {
                if (locotomora.calcularArrastreUtil() < this.obtenerKilosDeEmpuje() * 5 ) {
                    return false;
                }
            }
            return true;
        }*/
        return locomotoras.stream().allMatch(locotomora -> locotomora.calcularArrastreUtil() >= this.obtenerKilosDeEmpuje() * 5);
    }

    // 5.
    private double calcularArrastreUtilTotal() {
        /*
        double arrastreUtilTotal = 0;
        for (Locotomora locotomora : locomotoras) {
            arrastreUtilTotal += locotomora.calcularArrastreUtil();
        }
        return arrastreUtilTotal;
        */
        return locomotoras.stream().mapToDouble(Locotomora::calcularArrastreUtil).sum();
    }

    public boolean puedeMoverse() {
        return this.calcularArrastreUtilTotal() >= this.obtenerKilosDeEmpuje();
    }

    // 6.
    public double calcularEmpujeFaltante() {
        return this.obtenerKilosDeEmpuje() - this.calcularArrastreUtilTotal();
    }
}
