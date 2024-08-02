package org.example;

public class Gerente extends AprobadorBase {
    private static final int MONTO_MAXIMO = 120000;

    @Override
    public boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= MONTO_MAXIMO;
    }
}
