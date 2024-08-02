package cargables;

public class Bicicleta implements ICargable {
    private int tamanioRodado;
    private boolean esElectrica;
    private int cantCambios;
    private boolean esPlegable;

    public Bicicleta(int tamanioRodado, boolean esElectrica, int cantCambios, boolean esPlegable) {
        this.tamanioRodado = tamanioRodado;
        this.esElectrica = esElectrica;
        this.cantCambios = cantCambios;
        this.esPlegable = esPlegable;
    }

    public int getRodado() {
        return this.tamanioRodado;
    }

    public boolean esElectrica() {
        return this.esElectrica;
    }

    public int getCambios() {
        return this.cantCambios;
    }

    public boolean esPlegable() {
        return this.esPlegable;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.BICICLETA;
    }

    @Override
    public String toString() {
        return "Bicicleta";
    }
}
