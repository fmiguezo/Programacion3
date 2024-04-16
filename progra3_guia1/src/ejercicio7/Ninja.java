package ejercicio7;

public class Ninja {
    // Atributos
    private String arteMarcial;
    private String arma;
    private int fuerza;
    private int salto;

    // Constructor
    public Ninja() {
    }

    public Ninja(String arteMarcial, String arma, int fuerza, int salto) {
        this.arteMarcial = arteMarcial;
        this.arma = arma;
        this.fuerza = fuerza;
        this.salto = salto;
    }

    // Métodos
    public void saltar(int multiplicador){
        System.out.println(this.salto * multiplicador);
    }

    public void ataque(){
        System.out.println("El ninja usa " + this.arma + " y el arte marcial es " + this.arteMarcial);
    }

    @Override
    public String toString() {
        return "ejercicio7.Ninja{" +
                "arteMarcial='" + arteMarcial + '\'' +
                ", arma='" + arma + '\'' +
                ", fuerza=" + fuerza +
                ", salto=" + salto +
                '}';
    }

    // Getters y setters
    public String getArteMarcial() {
        return this.arteMarcial;
    }

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    public String getArma() {
        return this.arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSalto() {
        return this.salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }
}
