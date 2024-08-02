package cargables;

public class Caja implements ICargable {
    private boolean esPequenia;

    public Caja() {
        this(true);
    }

    public Caja(boolean esPequenia) {
        this.esPequenia = esPequenia;
    }

    public boolean esPequenia() {
        return esPequenia;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.CAJA;
    }

    @Override
    public String toString() {
        return "Caja";
    }
}
