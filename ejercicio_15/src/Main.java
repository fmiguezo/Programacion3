public class Main {
    public static void main(String[] args) {
        Acorazado acorazado = new Acorazado("Acorazado");
        Destructor destructor = new Destructor("Destructor");

        BarcoHospital barcoHospital = new BarcoHospital("Sibelancia", 75);

        Lancha lancha1 = new Lancha("La gaucha");
        Lancha lancha2 = new Lancha("El gaucho");

        System.out.println(acorazado);
        System.out.println(destructor);
        System.out.println(barcoHospital);
        System.out.println(lancha1);
        System.out.println(lancha2);

    }

}