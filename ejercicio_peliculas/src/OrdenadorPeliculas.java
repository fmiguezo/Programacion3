import java.util.ArrayList;

public class OrdenadorPeliculas {
    public void ordenarPorVisualizaciones(ArrayList<Pelicula> peliculas, Orden orden) {
        switch (orden) {
            case ASC:
                peliculas.sort(new ComparadorVisualizaciones());
                break;
            case DESC:
                peliculas.sort(new ComparadorVisualizaciones().reversed());
                break;
        }
    }

    public void ordenarPorFecha(ArrayList<Pelicula> peliculas, Orden orden) {
        switch (orden) {
            case ASC:
                peliculas.sort(new ComparadorFecha());
                break;
            case DESC:
                peliculas.sort(new ComparadorFecha().reversed());
                break;
        }
    }
}
