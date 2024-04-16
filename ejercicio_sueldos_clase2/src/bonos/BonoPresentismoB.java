package bonos;

import categorias.Empleado;

public class BonoPresentismoB extends Bono {
    @Override
    public Double calcularBono(int valor, Empleado empleado) {
        return 500.0;
    }
}
