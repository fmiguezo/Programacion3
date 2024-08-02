import java.util.ArrayList;

public class SistemaMontaje {
    private ArrayList<IHerramientas> herramientas;

    public SistemaMontaje() {
        this.herramientas = new ArrayList<IHerramientas>();
    }

    public String getHerramientas() {
        String herramientas = "";
        for (IHerramientas herramienta : this.herramientas) {
            herramientas += herramienta.getNombre() + ", ";
        }
        return herramientas.substring(0, herramientas.length() - 2);
    }

    public int getPeso(){
        int peso = 0;
        for (IHerramientas herramienta : this.herramientas) {
            peso += herramienta.getPeso();
        }
        return peso;
    }

    public void agregarHerramienta(IHerramientas herramienta) {
        this.herramientas.add(herramienta);
    }

    public void quitarHerramienta(IHerramientas herramienta) {
        this.herramientas.remove(herramienta);
    }
}
