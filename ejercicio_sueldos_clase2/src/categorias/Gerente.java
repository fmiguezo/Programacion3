package categorias;

public class Gerente extends CategoriaEmpleado {
    @Override
    public String getNombre() {
        return "Gerente";
    }

    @Override
    public Double getSueldo() {
        return 100000.0;
    }
}
