import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NameException, CostException, ObservationException {
        Articulo mesa = new Articulo("Mesa", 1000);
        Articulo escritorio = new Articulo("Escritorio", 1500);
        Articulo placard = new Articulo("Placard", 1800);

        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        articulos.add(mesa);
        articulos.add(escritorio);
        articulos.add(placard);

        ListaPrecios listaMayorista = new ListaPrecios("Lista Mayorista", "01/01/2021", TipoLista.MAYORISTA);
        ListaPrecios listaMinorista = new ListaPrecios("Lista Minorista", "01/01/2021", TipoLista.MINORISTA);

        for (Articulo articulo : articulos) {
            listaMayorista.agregarArticulo(articulo);
            listaMinorista.agregarArticulo(articulo);
        }

        listaMayorista.imprimir();
        listaMinorista.imprimir();

        listaMayorista.validarPrecios();
        listaMayorista.imprimir();
    }
}