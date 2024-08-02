package vehiculos;

import cargables.ICargable;
import cargables.TipoItem;

public class Camioneta extends VehiculoCarga {
    public Camioneta() {
        super(100);
    }

    @Override
    public boolean esTipoValido(ICargable item) {
        switch (item.getTipo()) {
            case COMODA:
            case HELADERA:
            case LAVARROPAS:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void listarItems() {
        System.out.println("Items en la camioneta:");
        super.listarItems();
    }
}
