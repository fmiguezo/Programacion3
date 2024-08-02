package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public abstract class Empleado {
    protected int legajo;
    protected Empleado jefe;
    protected Estado estado;

    public Empleado(int legajo) {
        this.legajo = legajo;
    }

    public Empleado(int legajo, Empleado jefe) {
        this.legajo = legajo;
        this.jefe = jefe;
    }

    // Métodos
    public abstract boolean quiereSubir(Micro micro);

    public boolean esJefe() {
        return this.jefe == null;
    }

    public void ocuparLugar(Micro micro){
        if (micro.getAsientosDisponibles() > 0) {
            this.estado = Estado.SENTADO;
        } else {
            this.estado = Estado.PARADO;
        }
    }

    public void bajar() {
        this.estado = Estado.A_PIE;
    }

    // Getters y setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
