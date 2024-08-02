package org.example;

public class MascotaVirtual {
    private EstadoMascota estado;

    public MascotaVirtual(EstadoMascota estado) {
        this.estado = estado;
    }

    public void cambiarEstado(EstadoMascota estado) {
        this.estado = estado;
    }
}
