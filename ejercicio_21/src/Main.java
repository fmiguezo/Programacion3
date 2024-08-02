import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creacion de sistema de identidades y de personas para probar el sistema de prestamos
        Person p1 = new Person("Juan", "Pérez", new Date(1990 - 1900, 5, 12));
        Person p2 = new Person("Ana", "López", new Date(1985 - 1900, 8, 23));
        Person p3 = new Person("Pedro", "Gómez", new Date(1995 - 1900, 2, 15));
        Person p4 = new Person("María", "Díaz", new Date(2010 - 1900, 11, 30));

        IdentitySystem identitySystem = new IdentitySystem();
        identitySystem.addIdentity("123", p1);
        identitySystem.addIdentity("456", p2);
        identitySystem.addIdentity("789", p3);
        identitySystem.addIdentity("101", p4);

        PersonIdentity personIdentity = new PersonIdentity(identitySystem);


        // Creacion de sistema bancario y solicitud de prestamos
        Date today = new Date();
        System.out.println(today);
        System.out.println(p4.getBirthDate());

        BankSystem bankSystem = new BankSystem();
        ;
        bankSystem.calculateLoan(personIdentity.getInfo("123"), 35000);
        bankSystem.calculateLoan(personIdentity.getInfo("456"), 45000);
        bankSystem.calculateLoan(personIdentity.getInfo("789"), 70000);
        bankSystem.calculateLoan(personIdentity.getInfo("101"), 25000);
    }
}