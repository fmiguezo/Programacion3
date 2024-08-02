public abstract class Navio {
    private String nombre;
    private double flotabilidad;
    private double estabilidad;

    public Navio() {
        this.nombre = "";
        this.flotabilidad = 0;
        this.estabilidad = 0;
    }

    public Navio (String nombre) {
        this();
        this.nombre = nombre;
    }

    public Navio(String nombre, double flotabilidad, double estabilidad) {
        this.nombre = nombre;
        this.flotabilidad = flotabilidad;
        this.estabilidad = estabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getFlotabilidad() {
        return flotabilidad;
    }

    public double getEstabilidad() {
        return estabilidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFlotabilidad(double flotabilidad) {
        this.flotabilidad = flotabilidad;
    }

    public void setEstabilidad(double estabilidad) {
        this.estabilidad = estabilidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nFlotabilidad: " + flotabilidad + "\nEstabilidad: " + estabilidad + "\n";
    }
}
