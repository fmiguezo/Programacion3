import java.util.Date;

public class BankSystem {

    public int calculateAge(Person person) {
        Date today = new Date(); // Fecha actual
        long dateDifference = Math.abs(today.getTime() - person.getBirthDate().getTime());
        long age = dateDifference / (1000L * 60 * 60 * 24 * 365); // Convertir milisegundos a años
        return (int) age;
    }

    public void calculateLoan(Person person, double salary){
        if (person != null) {
            int age = calculateAge(person);
            if (age >= 21) {
                if (salary > 30000 && salary < 40000) {
                    System.out.println("Préstamo aprobado: $80.000 con un 30% de interés.\n");
                } else if (salary >= 40000 && salary < 60000) {
                    System.out.println("Préstamo aprobado: $120.000 con un 35% de interés\n");
                } else if (salary >= 60000 && salary <= 80000) {
                 System.out.println("Préstamo aprobado: $140.000 con un 39% de interés.\n");
                } else if (salary > 80000) {
                    System.out.println("No se extiende préstamos para salarios mayores a $80.000.\n");
                }
                else {
                    System.out.println("Préstamo no aprobado. Salario menor a $30.000.\n");
                }
            } else {
                System.out.println("No es posible extender el préstamos por no reunir la edad mínima.\n");
            }
        } else {
            System.out.println("No se encontró la persona con el ID proporcionado.\n");
        }
    }
}
