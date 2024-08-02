package edu.ar.cuvl.micro;

import edu.ar.cuvl.empleado.Empleado;
import edu.ar.cuvl.empleado.Estado;
import edu.ar.cuvl.exceptions.EmpleadoNoQuiereSubirException;
import edu.ar.cuvl.exceptions.MicroLlenoException;
import edu.ar.cuvl.exceptions.MicroVacioException;

import java.util.HashSet;

public class Micro {
    private int capacidadParados;
    private int capacidadSentados;
    private double volumen;
    private String patente;
    private HashSet<Empleado> pasajeros;
    private Empleado primerPasajero;

    public Micro(int capacidadParados, int capacidadSentados, double volumen) {
        this(capacidadParados, capacidadSentados, volumen, "");
    }

    public Micro(int capacidadParados, int capacidadSentados, double volumen, String patente) {
        this.capacidadParados = capacidadParados;
        this.capacidadSentados = capacidadSentados;
        this.volumen = volumen;
        this.patente = patente;
        this.pasajeros = new HashSet<>();
    }

    public void subirPasajero(Empleado empleado) throws MicroLlenoException {
        this.quiereSubir(empleado);
        if (getLugaresDisponibles() > 0) {
            setPrimerPasajero(empleado);
            pasajeros.add(empleado);
        } else {
            throw new MicroLlenoException("No hay lugar para subir pasajeros.");
        }
    }

    public void quiereSubir(Empleado empleado) throws EmpleadoNoQuiereSubirException {
        if (false == empleado.quiereSubir(this)) {
            throw new EmpleadoNoQuiereSubirException(String.valueOf(empleado.getLegajo()));
        }
    }

    public void bajarPasajero(Empleado empleado) throws MicroVacioException {
        if (this.pasajeros.isEmpty()) {
            throw new MicroVacioException("No hay pasajeros para bajar.");
        }
        pasajeros.remove(empleado);
    }

    public int getLugaresDisponibles() {
        return this.capacidadSentados + this.capacidadParados - this.pasajeros.size();
    }

    private int getOcupados(Estado estado) {
        return (int) this.pasajeros.stream().filter(pasajero -> pasajero.getEstado() == estado).count();
    }

    public int getAsientosDisponibles() {
        return this.capacidadSentados - this.getOcupados(Estado.SENTADO);
    }

    public int getParadosDisponibles() {
        return this.capacidadParados - this.getOcupados(Estado.PARADO);
    }

    public Empleado getPrimerPasajero() {
        return this.primerPasajero;
    }

    public double getVolumen() {
        return this.volumen;
    }

    protected void setPrimerPasajero(Empleado empleado) {
        if (this.pasajeros.isEmpty()) {
            this.primerPasajero = empleado;
        }
    }

    public HashSet<Empleado> getPasajeros() {
        return this.pasajeros;
    }

    protected void addPasajero(Empleado empleado) {
        this.pasajeros.add(empleado);
    }
}
