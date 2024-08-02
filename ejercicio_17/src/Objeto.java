import java.util.ArrayList;

public class Objeto {
    private String nombre;
    private Material material;
    private double volumen;
    private ArrayList<Objeto> contenido = new ArrayList<>();
    private Tipo tipo;

    public Objeto(String nombre, Material material, double volumen) {
        this.nombre = nombre;
        this.material = material;
        this.volumen = volumen;
    }

    public Material getMaterial() {
        return this.material;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void agregarContenido(Objeto objeto) {
        if (this.volumen >= objeto.volumen) {
            this.contenido.add(objeto);
        } else {
            System.out.println("No se puede agregar " + this.nombre + " a " + objeto.nombre);
        }
    }

    public ArrayList<Objeto> verContenido() {
        return this.contenido;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre + " de " + this.material + " con volumen de " + this.volumen + "cm3. Es un objeto " + this.tipo + ".";
    }
}
