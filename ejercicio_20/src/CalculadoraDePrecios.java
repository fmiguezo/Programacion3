import java.util.TreeMap;

public class CalculadoraDePrecios {
    public double calcularPrecio(Articulo articulo, TipoLista tipoLista) {
        switch (tipoLista) {
            case MAYORISTA:
                return articulo.getCosto() * 0.9;
            case MINORISTA:
                return articulo.getCosto() * 1.1;
        }
        return 0;
    }

    public void validarPrecios(TreeMap<Articulo, Double> articulos) {
        double mayor = articulos.lastEntry().getValue();
        for (Articulo articulo : articulos.keySet()) {
            // Si la diferencia entre el mayor y los articulos restantes es mayor al 30% del precio del articulo, ajustar el precio
            double precio = articulos.get(articulo);
            if (mayor - precio > precio * 0.3) {
                articulos.put(articulo, mayor * 0.7);
            }
        }
    }
}
