package org.example;

public interface IAprobador {
    public void setNext(IAprobador aprobador);
    public boolean aprobarSolicitud(Solicitud solicitud);
}
