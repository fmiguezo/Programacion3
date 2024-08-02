public class Grua {
    private double capacidadDeArriaje;

    public Grua() {
        this.capacidadDeArriaje = 0;
    }

    public Grua(double capacidadDeArriaje){
        this.capacidadDeArriaje = capacidadDeArriaje;
    }

    public double getCapacidadDeArriaje(){
        return capacidadDeArriaje;
    }

    public void setCapacidadDeArriaje(double capacidadDeArriaje){
        this.capacidadDeArriaje = capacidadDeArriaje;
    }

    public void arriar(Object carga){
        System.out.println("Arriando " + carga.toString());
    }

    @Override
    public String toString(){
        return "Grua con capacidad de arriaje de " + capacidadDeArriaje + " kilos.";
    }
}
