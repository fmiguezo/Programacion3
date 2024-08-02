public class Main {
    public static void main(String[] args) {

        Persona juliana = new Persona("Juliana");
        Persona catalina = new Persona("Catalina");
        MotorolaG5 motorolaG5 = new MotorolaG5();
        iPhone iphone =  new iPhone();

        Celular celuJuli = new Celular(motorolaG5);
        Celular celuCata = new Celular(iphone);

        juliana.setCelular(celuJuli);
        //catalina.setCelular(celuCata);

        juliana.encenderCelular();
        catalina.encenderCelular();
        catalina.getEstadoCelular();
        juliana.getBateriaCelular();

        juliana.llamar(catalina);
        juliana.finalizarLlamada(catalina);
        catalina.getBateriaCelular();

        //catalina.llamar(juliana);
        //catalina.finalizarLlamada(juliana);

    }
}