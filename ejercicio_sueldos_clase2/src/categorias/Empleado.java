package categorias;

import bonos.Bono;
import bonos.BonoPresentismoA;
import bonos.BonoPresentismoB;
import bonos.BonoResultado;
import calculador.CalculadorSueldo;
import calculador.CalculadorSueldoAvanzado;

public class Empleado {
    // Atributos
    private CategoriaEmpleado categoria;
    private int cantidadFaltas;
    private int cumplimientoObjetivos;
    private Bono bonoPresentismoA;
    private Bono bonoPresentismoB;
    private Bono bonoResultado;
    private CalculadorSueldo calculadorSueldo;

    // Constructor
    public Empleado() {
        this.categoria = null;
        this.cantidadFaltas = 0;
        this.cumplimientoObjetivos = 0;
        this.bonoPresentismoA = new BonoPresentismoA();
        this.bonoPresentismoB = new BonoPresentismoB();
        this.bonoResultado = new BonoResultado();
        this.calculadorSueldo = new CalculadorSueldoAvanzado();
    }

    // Getters
    public CategoriaEmpleado getCategoria() {
        return this.categoria;
    }

    public int getCantidadFaltas() {
        return this.cantidadFaltas;
    }

    public int getCumplimientoObjetivos() {
        return this.cumplimientoObjetivos;
    }

    public Double getSueldo() {
        return this.calculadorSueldo.getSueldo(this);
    }

    public Double getBonoPresentismoA() {
        return this.bonoPresentismoA.calcularBono(this.cantidadFaltas, this);
    }

    public Double getBonoPresentismoB() {
        return this.bonoPresentismoB.calcularBono(this.cantidadFaltas, this);
    }

    public Double getBonoResultado() {
        return this.bonoResultado.calcularBono(this.cumplimientoObjetivos, this);
    }

    // Setters
    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }

    public void setCumplimientoObjetivos(int cumplimientoObjetivos) {
        this.cumplimientoObjetivos = cumplimientoObjetivos;
    }
}
