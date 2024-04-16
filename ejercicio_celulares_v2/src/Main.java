public class Main {
    public static void main(String[] args) {

        Persona juliana = new Persona("Juliana");
        Persona catalina = new Persona("Catalina");
        MotorolaG5 motorolaG5 = new MotorolaG5();
        iPhone iphone =  new iPhone();

        Celular celuJuli = new Celular(motorolaG5);
        Celular celuCata = new Celular(iphone);

        juliana.setCelular(celuJuli);
        catalina.setCelular(celuCata);

        juliana.getCelular().encender();
        catalina.getCelular().encender();
        System.out.println(catalina.getCelular().isEncendido());
        System.out.println(juliana.getCelular().getBateria());

        juliana.llamar(catalina);
        juliana.finalizarLlamada(catalina);
        System.out.println(catalina.getCelular().getBateria());

        catalina.llamar(juliana);
        catalina.finalizarLlamada(juliana);

    }
}