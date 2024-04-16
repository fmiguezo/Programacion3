public class Main {
    public static void main(String[] args) {
        Persona juliana = new Persona("Juliana");
        Persona catalina = new Persona("Catalina");
        MotorolaG5 motorolaG5 = new MotorolaG5();
        iPhone iphone = new iPhone();

        juliana.setCelular(motorolaG5);
        catalina.setCelular(iphone);

        juliana.getCelular().encender();
        catalina.getCelular().encender();
        //System.out.println(catalina.getCelular().isEncendido());
        //System.out.println(juliana.getCelular().getBateria());

        //System.out.println(motorolaG5.getBateria());

        juliana.llamar(catalina);
        juliana.finalizarLlamada(catalina);

        //catalina.llamar(juliana);
        //catalina.finalizarLlamada(juliana);

    }
}