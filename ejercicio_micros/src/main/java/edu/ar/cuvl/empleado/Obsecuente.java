package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;

public class Obsecuente extends Empleado {
    public Obsecuente(int legajo, Empleado jefe) {
        super(legajo, jefe);
    }

    @Override
    public boolean quiereSubir(Micro micro) {
        try {
            return jefe.quiereSubir(micro);
        } catch (NullPointerException e) {
            throw new RuntimeException("Este obsecuente no tiene jefe, no sabe si quiere subir.");
        }
    }
}
