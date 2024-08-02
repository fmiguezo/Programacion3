package org.example;

public class PiononoGangrenosoBuilder implements PostreBuilder {
    private PiononoGangrenoso postre;

    @Override
    public void reset() {
        postre = new PiononoGangrenoso();
    }

    @Override
    public void agregarIngrediente1() {
        postre.setIngrediente1("Recorte de goma eva.");
    }

    @Override
    public void agregarIngrediente2() {
        postre.setIngrediente2("1 ojo daltónico.");
    }

    @Override
    public void agregarIngrediente3() {
        postre.setIngrediente3("200gr de harina.");
    }

    public PiononoGangrenoso getPostre() {
        return postre;
    }
}
