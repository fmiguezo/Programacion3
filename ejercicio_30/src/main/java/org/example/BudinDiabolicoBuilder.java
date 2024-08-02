package org.example;

public class BudinDiabolicoBuilder implements PostreBuilder {
    private BudinDiabolico postre;

    @Override
    public void reset() {
        postre = new BudinDiabolico();
    }

    @Override
    public void agregarIngrediente1() {
        postre.setIngrediente1("100cm3 de bilis.");
    }

    @Override
    public void agregarIngrediente2() {
        postre.setIngrediente2("200gr de harina.");
    }

    @Override
    public void agregarIngrediente3() {
        postre.setIngrediente3("10cm3 de lavandina.");
    }

    public BudinDiabolico getPostre() {
        return postre;
    }
}
