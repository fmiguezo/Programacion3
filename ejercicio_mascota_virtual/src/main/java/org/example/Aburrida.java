package org.example;

public class Aburrida extends EstadoMascota {
    private MascotaVirtual mascota;
    private int minutosAburrida;

    public Aburrida(MascotaVirtual mascota) {
        this.mascota = mascota;
        minutosAburrida = 0;
    }

    @Override
    public void comer() {
        if(minutosAburrida > 80) {
            EstadoMascota contenta = new Contenta();
            cambiarEstado(contenta);
        }
    }

    @Override
    public void jugar() {
        EstadoMascota contenta = new Contenta();
        cambiarEstado(contenta);
    }

    public void pasarTiempoAburrida(int minutos){
        minutosAburrida += minutos;
    }
}
