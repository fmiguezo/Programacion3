import categorias.*;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Empleado();
        gerente.setCategoria(new Gerente());

        Double sueldoGerente = gerente.getCategoria().getSueldo();
        String nombre = gerente.getCategoria().getNombre();

        System.out.println("El sueldo de un " + nombre + " es de " + sueldoGerente);

        gerente.setCantidadFaltas(2);
        gerente.setCumplimientoObjetivos(100);

        Double bonoA = gerente.getBonoPresentismoA();
        Double bonoB = gerente.getBonoPresentismoB();
        Double bonoR = gerente.getBonoResultado();

        System.out.println("El bono A es de " + bonoA);
        System.out.println("El bono B es de " + bonoB);
        System.out.println("El bono R es de " + bonoR);

        Double sueldo = gerente.getSueldo();

        System.out.println("El sueldo de un " + nombre + " con " + gerente.getCantidadFaltas() + " faltas y " + gerente.getCumplimientoObjetivos() + "% de cumplimiento de objetivos es de " + sueldo);
    }
}