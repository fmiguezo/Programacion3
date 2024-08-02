package org.example;

public class Empleado extends AprobadorBase {
    private static final int MONTO_MAXIMO =  10000;

    @Override
    public boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= MONTO_MAXIMO;
    }
}
