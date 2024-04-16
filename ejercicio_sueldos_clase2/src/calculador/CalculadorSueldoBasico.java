package calculador;

import categorias.Empleado;

public class CalculadorSueldoBasico extends CalculadorSueldo {
    @Override
    public Double getSueldo(Empleado empleado) {
        return empleado.getCategoria().getSueldo();
    }
}
