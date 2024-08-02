package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public class Moderado extends Empleado {
    private int lugaresLibres;

    public Moderado(int legajo, int lugaresLibres) {
        super(legajo);
        this.lugaresLibres = lugaresLibres;
    }

    public Moderado(int legajo, Empleado jefe, int lugaresLibres) {
        super(legajo, jefe);
        this.lugaresLibres = lugaresLibres;
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return micro.getLugaresDisponibles() >= this.lugaresLibres;
    }
}
