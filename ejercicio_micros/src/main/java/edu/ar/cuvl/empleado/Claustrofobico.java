package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public class Claustrofobico extends Empleado {
    public Claustrofobico(int legajo) {
        super(legajo);
    }

    public Claustrofobico(int legajo, Empleado jefe) {
        super(legajo, jefe);
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        return micro.getVolumen() > 120;
    }
}
