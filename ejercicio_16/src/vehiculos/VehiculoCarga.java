package vehiculos;

import cargables.ICargable;
import cargables.TipoItem;
import java.util.ArrayList;

public abstract class VehiculoCarga {
    protected int capacidadCarga;
    protected ArrayList<ICargable> items;

    public VehiculoCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        this.items = new ArrayList<ICargable>();
    }

    public void listarItems() {
        for (ICargable item : items) {
            System.out.println("- " + item);
        }
        System.out.println();
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public ArrayList<ICargable> getItems() {
        return items;
    }

    public abstract boolean esTipoValido(ICargable item);
}
