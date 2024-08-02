package org.example;

public class Hambrienta extends EstadoMascota {
    private MascotaVirtual mascota;

    @Override
    public void comer() {
        EstadoMascota contenta = new Contenta();
        cambiarEstado(contenta);
    }

    @Override
    public void jugar() {
    }
}
