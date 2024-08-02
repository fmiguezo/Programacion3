package edu.ar.cuvl;

public class Auto {
    private int bateria;

    Auto(int bateria) {
        this.bateria = bateria;
    }

    public int avanzar(int km) {
        this.bateria -= this.bateria / km;
        if (this.bateria < 0 ) {
            this.bateria = 0;
        }
        return this.bateria;
    }
}
