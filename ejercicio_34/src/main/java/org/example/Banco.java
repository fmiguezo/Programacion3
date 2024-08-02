package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<IAprobador> aprobadores = new ArrayList<>();
    private List<Solicitud> solicitudes = new ArrayList<>();

    public void agregarAprobador(IAprobador aprobador) {
        aprobadores.add(aprobador);
    }

    public void agregarSolictud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }
}
