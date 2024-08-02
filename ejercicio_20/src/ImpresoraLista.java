import java.util.Map;

public class ImpresoraLista {

    public static void imprimirLista(ListaPrecios lista) {
        System.out.println("Lista de precios: " + lista.getNombre());
        System.out.println("Fecha de vigencia: " + lista.getFechaVigencia());
        System.out.println("Tipo de lista: " + lista.getTipoLista());
        System.out.println("Articulos:");
        for (Map.Entry<Articulo, Double> entry : lista.getArticulos().entrySet()) {
            Articulo articulo = entry.getKey();
            Double precio = entry.getValue();
            System.out.println(articulo.getNombre() + " - $ " + String.format("%.2f", precio));
        }
        System.out.println();
    }
}
