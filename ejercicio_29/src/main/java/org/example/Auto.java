package org.example;

public abstract class Auto {
    protected AireAcondicionado ac;
    protected Reproductor repr;

    public Auto(){}

    public Auto(AireAcondicionado ac, Reproductor repr) {
        this.ac = ac;
        this.repr = repr;
    }

    public AireAcondicionado getAc() {
        return ac;
    }

    public void setAc(AireAcondicionado ac) {
        this.ac = ac;
    }

    public Reproductor getRepr() {
        return repr;
    }

    public void setRepr(Reproductor repr) {
        this.repr = repr;
    }
}
