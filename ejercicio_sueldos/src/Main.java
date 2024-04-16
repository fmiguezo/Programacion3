public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bill Lumbergh");
        Administrativo administrativo = new Administrativo("Peter Gibbons");
        Cadete cadete = new Cadete();
        Operador operador = new Operador("Milton Waddams");

        double sueldoGerente = gerente.calcularSueldo(0, 100);
        double sueldoAdministrativo = administrativo.calcularSueldo(1, 80);
        double sueldoCadete = cadete.calcularSueldo(3, 70);
        double sueldoOperador = operador.calcularSueldo(0, 80);

        System.out.println(gerente);
        System.out.println("Sueldo Gerente: " + sueldoGerente);
        System.out.println();
        System.out.println(administrativo);
        System.out.println("Sueldo Administrativo: " + sueldoAdministrativo);
        System.out.println();
        System.out.println("Sueldo Cadete: " + sueldoCadete);
        System.out.println();
        System.out.println(operador);
        System.out.println("Sueldo Operador: " + sueldoOperador);


    }
}