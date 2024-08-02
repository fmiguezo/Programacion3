package org.example;

public interface Aprobador {
    public void setNext(Aprobador aprobador);
    public boolean aprobarSolicitud(Solicitud solicitud);
}
