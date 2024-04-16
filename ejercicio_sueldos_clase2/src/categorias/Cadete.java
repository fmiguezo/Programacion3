package categorias;

public class Cadete extends CategoriaEmpleado {

    @Override
    public String getNombre() {
        return "Cadete";
    }

    @Override
    public Double getSueldo() {
        return 1000.0;
    }
}
