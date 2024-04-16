package bonos;

import categorias.Empleado;

public class BonoResultado extends Bono {
    @Override
    public Double calcularBono(int valor, Empleado empleado) {
        if (valor >= 100) {
            return empleado.getCategoria().getSueldo() * 0.1;
        } else if (valor >= 80 && valor < 100) {
            return 800.0;
        } else {
            return 0.0;
        }
    }
}
