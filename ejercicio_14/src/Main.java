public class Main {
    public static void main(String[] args) {
        Dron dron = new Dron(5, 100, new SistemaMontaje(), 200);

        dron.agregarHerramienta(new SensorInfrarrojo());
        System.out.println(dron.getVelocidadMaxima());
        System.out.println(dron.getAlturaMaxima());
        System.out.println(dron + "\n");

        dron.agregarHerramienta(new Taser());
        System.out.println(dron + "\n");

        dron.agregarHerramienta(new BrazoRobotico());
        System.out.println(dron + "\n");

        dron.quitarHerramienta(new SensorInfrarrojo());
        System.out.println(dron);
    }
}