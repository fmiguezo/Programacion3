package org.example;

public class Contenta extends EstadoMascota {
    private int nivelContenta = 0;
    private MascotaVirtual mascota;

    @Override
    public void comer() {
        nivelContenta += 1;
    }

    @Override
    public void jugar() {
        nivelContenta += 2;
    }
}
