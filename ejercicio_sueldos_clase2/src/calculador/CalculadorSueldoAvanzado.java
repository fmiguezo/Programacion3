package calculador;

import categorias.Empleado;

public class CalculadorSueldoAvanzado extends CalculadorSueldo {
    @Override
    public Double getSueldo(Empleado empleado) {
        Double basico = empleado.getCategoria().getSueldo();
        Double bonoPresentismoA = empleado.getBonoPresentismoA();
        Double bonoPresentismoB = empleado.getBonoPresentismoB();
        Double bonoResultado = empleado.getBonoResultado();
        return basico + bonoPresentismoA + bonoPresentismoB + bonoResultado;
    }
}
