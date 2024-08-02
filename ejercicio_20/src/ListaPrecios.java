import java.util.HashMap;
import java.util.TreeMap;

public class ListaPrecios {
    private String nombre;
    private String fechaVigencia;
    private TipoLista tipoLista;
    private TreeMap<Articulo, Double> articulos = new TreeMap<>(new ComparadorCostos());

    public ListaPrecios(String nombre, String fechaVigencia, TipoLista tipoLista) {
        this.nombre = nombre;
        this.fechaVigencia = fechaVigencia;
        this.tipoLista = tipoLista;
    }

    public void agregarArticulo(Articulo articulo) {
        this.articulos.put(articulo, calcularPrecio(articulo));
    }

    private double calcularPrecio(Articulo articulo) {
        double precio = new CalculadoraDePrecios().calcularPrecio(articulo, this.tipoLista);
        return precio;
    }

    public void validarPrecios() {
        new CalculadoraDePrecios().validarPrecios(this.articulos);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public TreeMap<Articulo, Double> getArticulos() {
        return this.articulos;
    }

    public String getTipoLista() {
        return this.tipoLista.toString();
    }

    public void imprimir() {
        ImpresoraLista.imprimirLista(this);
    }
}
