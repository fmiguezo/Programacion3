package bonos;

import categorias.Empleado;

public class BonoPresentismoA extends Bono {
    @Override
    public Double calcularBono(int valor, Empleado empleado) {
        switch (valor) {
            case 0:
                return 1000.0;
            case 1:
                return 450.0;
            default:
                return 0.0;
        }
    }
}
