package cargables;

public class Comoda implements ICargable {
    private double superficie;
    private int cantCajones;

    public Comoda(double superficie, int cantCajones) {
        this.superficie = superficie;
        this.cantCajones = cantCajones;
    }

    public double getSuperficie() {
        return this.superficie;
    }

    public int getCajones() {
        return this.cantCajones;
    }

    @Override
    public TipoItem getTipo() {
        return TipoItem.COMODA;
    }
}
