package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public class Fiaca extends Empleado {
    public Fiaca(int legajo) {
        super(legajo);
    }

    public Fiaca(int legajo, Empleado jefe) {
        super(legajo, jefe);
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return micro.getAsientosDisponibles() > 0;
    }
}
