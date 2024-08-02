package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public class Apurado extends Empleado {

    public Apurado(int legajo) {
        super(legajo);
    }

    public Apurado(int legajo, Empleado jefe) {
        super(legajo, jefe);
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return true;
    }
}
