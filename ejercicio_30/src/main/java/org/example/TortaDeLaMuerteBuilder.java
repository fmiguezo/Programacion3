package org.example;

public class TortaDeLaMuerteBuilder implements PostreBuilder {
    private TortaDeLaMuerte postre;

    @Override
    public void reset() {
        postre = new TortaDeLaMuerte();
    }

    @Override
    public void agregarIngrediente1() {
        postre.setIngrediente1("10 huevos de lagarto");
    }

    @Override
    public void agregarIngrediente2() {
        postre.setIngrediente2("300gr de harina");
    }

    @Override
    public void agregarIngrediente3() {
        postre.setIngrediente3("3 gotas de amonio");
    }

    public TortaDeLaMuerte getPostre() {
        return postre;
    }
}
