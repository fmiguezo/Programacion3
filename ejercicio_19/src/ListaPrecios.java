import java.util.ArrayList;
import java.util.Date;

public class ListaPrecios {
    private String nombre;
    private Date fechaVigencia;
    private ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public ListaPrecios(String nombre, Date fechaVigencia) {
        this.nombre = nombre;
        this.fechaVigencia = fechaVigencia;
    }
}
