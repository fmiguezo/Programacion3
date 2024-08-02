import cargables.ICargable;
import vehiculos.VehiculoCarga;

public class Cargador {
    public Cargador() {
    }

    public static void cargar(VehiculoCarga vehiculo, ICargable item) {
        if (vehiculo.esTipoValido(item) && vehiculo.getCapacidadCarga() > vehiculo.getItems().size()) {
            vehiculo.getItems().add(item);
            System.out.println("Se cargo el item " + item + " en el vehiculo.");
        } else {
            System.out.println("No se puede cargar el item " + item + " en el vehiculo.");
        }
    }
}
