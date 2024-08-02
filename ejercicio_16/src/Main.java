import cargables.*;
import vehiculos.Auto;
import vehiculos.Camioneta;

public class Main {
    public static void main(String[] args) {
        Cargador cargador = new Cargador();
        Auto auto = new Auto();
        Camioneta camioneta = new Camioneta();

        Bicicleta bicicleta1 = new Bicicleta(26, false, 21, true);
        Bicicleta bicicleta2 = new Bicicleta(24, true, 18, false);
        Comoda comoda = new Comoda(4, 2);
        Caja caja1 = new Caja(true);
        Caja caja2 = new Caja(false);
        Heladera heladera = new Heladera(2, true);
        Lavarropas lavarropas = new Lavarropas(3, 5,2);

        cargador.cargar(auto, bicicleta1);
        cargador.cargar(auto, bicicleta2);
        cargador.cargar(auto, comoda);
        cargador.cargar(auto, caja1);
        cargador.cargar(camioneta, caja2);
        cargador.cargar(camioneta, heladera);
        cargador.cargar(camioneta, lavarropas);

        auto.listarItems();
        camioneta.listarItems();
    }
}