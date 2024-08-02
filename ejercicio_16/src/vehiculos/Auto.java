package vehiculos;
import cargables.Bicicleta;
import cargables.Caja;
import cargables.ICargable;

public class Auto extends VehiculoCarga {
    public Auto() {
        super(50);
    }

    @Override
    public boolean esTipoValido(ICargable item) {
        switch (item.getTipo()) {
            case BICICLETA:
                Bicicleta bicicleta = (Bicicleta) item;
                return bicicleta.esPlegable();
            case TELEVISOR:
                return true;
            case CAJA:
                Caja caja = (Caja) item;
                return caja.esPequenia();
            default:
                return false;
        }
    }

    @Override
    public void listarItems() {
        System.out.println("Items en el auto:");
        super.listarItems();
    }
}
