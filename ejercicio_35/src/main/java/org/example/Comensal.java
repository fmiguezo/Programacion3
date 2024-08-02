package org.example;

public class ComensalBase implements IComensal {
    private IComensal next;
    private Plato plato;

    @Override
    public void setNext(IComensal comensal) {
        this.next = comensal;
    }

    public boolean puedeAgarrarPlato(Plato plato) {
        return this.plato.getNombre().equals(plato.getNombre());
    }

    @Override
    public void agarrarPlato(Plato plato) {
        if (this.puedeAgarrarPlato(plato)) {
            System.out.println("El comensal agarró el plato " + plato.getNombre());
        } else {
            this.next.agarrarPlato(plato);
        }
    }
}
