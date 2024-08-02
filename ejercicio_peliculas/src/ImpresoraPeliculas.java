import java.util.TreeSet;

public class Impresora {
    public void imprimirPeliculas(TreeSet<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    imprimirPeliculasPorVisualizaciones(TreeSet<Pelicula> peliculas, Orden orden) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
