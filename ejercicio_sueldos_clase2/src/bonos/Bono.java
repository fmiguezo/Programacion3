package bonos;

import categorias.Empleado;

public abstract class Bono {
    public abstract Double calcularBono(int valor, Empleado empleado);
}
