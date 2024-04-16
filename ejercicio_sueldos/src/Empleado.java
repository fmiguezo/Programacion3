public class Empleado {
    // Atributos
    protected String nombre;
    protected int sueldoNeto;
    protected int bonoPresentismoA;
    protected int bonoPresentismoB;
    protected double bonoResultado;
    protected int ausencias;

    // Constructor
    public Empleado() {
        new Empleado("");
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.sueldoNeto = 0;
        this.bonoPresentismoA = 0;
        this.bonoPresentismoB = 500;
        this.bonoResultado = 0;
        this.ausencias = 0;
    }

    // Getters
    public int getSueldoNeto() {
        return sueldoNeto;
    }

    public int getBonoPresentismo() {
        return bonoPresentismoA + bonoPresentismoB;
    }

    public double getBonoResultado() {
        return bonoResultado;
    }

    public int getAusencias() {
        return ausencias;
    }

    // Setters
    public void setSueldoNeto(int sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public void setAusencias(int ausencias) {
        this.ausencias = ausencias;
    }

    public void setBonoPresentismoA() {
        switch (this.ausencias) {
            case 0:
                this.bonoPresentismoA = 1000;
                break;
            case 1:
                this.bonoPresentismoA = 450;
                break;
            default:
                this.bonoPresentismoA = 0;
        }
    }

    public void setBonoResultado(double pctObjetivo) {
        if (pctObjetivo >= 100) {
            this.bonoResultado = this.sueldoNeto * 0.1;
        } else if (pctObjetivo >= 80 && pctObjetivo < 100) {
            this.bonoResultado = 800;
        } else {
            this.bonoResultado = 0;
        }
    }

    public double calcularSueldo() {
        return this.calcularSueldo(this.ausencias, 0);
    }

    public double calcularSueldo(double pctObjetivo) {
        return this.calcularSueldo(this.ausencias, pctObjetivo);
    }

    public double calcularSueldo(int ausencias, double pctObjetivo) {
        this.setAusencias(ausencias);
        this.setBonoPresentismoA();
        this.setBonoResultado(pctObjetivo);
        return this.sueldoNeto + this.bonoPresentismoA + this.bonoPresentismoB + this.bonoResultado;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nSueldo neto: " + this.sueldoNeto +
                "\nAusencias: " + this.ausencias +
                "\nBono Presentismo: " + (this.bonoPresentismoA + bonoPresentismoB) +
                "\nBono Resultado: " + this.bonoResultado;
    }
}
