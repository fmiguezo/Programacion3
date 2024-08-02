import java.util.HashMap;

public class ListaPrecios {
    private String nombre;
    private String fechaVigencia;
    private TipoLista tipoLista;
    private HashMap<Articulo, Double> articulos = new HashMap<Articulo, Double>();

    public ListaPrecios(String nombre, String fechaVigencia, TipoLista tipoLista) {
        this.nombre = nombre;
        this.fechaVigencia = fechaVigencia;
        this.tipoLista = tipoLista;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.put(articulo, calcularPrecio(articulo));
    }

    public double calcularPrecio(Articulo articulo) {
        switch (this.tipoLista) {
            case MAYORISTA:
                return articulo.getCosto() * 0.9;
            case MINORISTA:
                return articulo.getCosto() * 1.1;
        }
        return 0;
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

    public HashMap<Articulo, Double> getArticulos() {
        return this.articulos;
    }

    public String getTipoLista() {
        return this.tipoLista.toString();
    }

    public void imprimir() {
        ImpresoraLista.imprimirLista(this);
    }
}
