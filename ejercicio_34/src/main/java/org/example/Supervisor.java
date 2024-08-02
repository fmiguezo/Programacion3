package org.example;

public class Supervisor extends AprobadorBase {
    private static final int MONTO_MAXIMO = 40000;

    @Override
    public boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= MONTO_MAXIMO;
    }
}
