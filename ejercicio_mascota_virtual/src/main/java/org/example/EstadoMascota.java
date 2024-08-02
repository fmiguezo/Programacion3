package org.example;

public abstract class EstadoMascota {
    protected MascotaVirtual mascota;

    public abstract void comer();
    public abstract void jugar();

    protected void cambiarEstado(EstadoMascota estado) {
        mascota.cambiarEstado(estado);
    }

    protected void setMascota(MascotaVirtual mascota){
        this.mascota = mascota;
    }
}
