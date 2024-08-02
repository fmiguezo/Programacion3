package org.example;

public abstract class AprobadorBase implements IAprobador {
    private IAprobador next;

    @Override
    public void setNext(IAprobador next) {
        this.next = next;
    }

    public abstract boolean puedeAprobar(Solicitud solicitud);

    @Override
    public boolean aprobarSolicitud(Solicitud solicitud) {
        if (puedeAprobar(solicitud)) {
            return true;
        } else if (next != null) {
            return next.aprobarSolicitud(solicitud);
        }
        return false;
    }
}
