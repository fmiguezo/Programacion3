package categorias;

public class Administrativo extends CategoriaEmpleado {
    @Override
    public String getNombre() {
        return "Administrativo";
    }

    @Override
    public Double getSueldo() {
        return 40000.0;
    }
}
