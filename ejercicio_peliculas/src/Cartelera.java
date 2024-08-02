import java.util.ArrayList;

public class Cartelera {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    public void visualizarPelicula(Pelicula pelicula) {
        pelicula.visualizar();
    }

    public void ordernarPorVisualizaciones(Orden orden) {
        new OrdenadorPeliculas().ordenarPorVisualizaciones(peliculas, orden);
    }

    public void ordenarPorFecha(Orden orden) {
        new OrdenadorPeliculas().ordenarPorFecha(peliculas, orden);
    }

    public void imprimirPeliculas() {
        new ImpresoraPeliculas().imprimirPeliculas(peliculas);
    }

    public void obtenerMejorPuntuada() {
        int puntajeMaximo = 0;
        Pelicula mejorPuntuada = null;

        for (Pelicula pelicula : peliculas) {
            int puntaje = pelicula.verPuntaje();
            if (pelicula.verPuntaje() > puntajeMaximo) {
                puntajeMaximo = puntaje;
                mejorPuntuada = pelicula;
            }
        }
        System.out.println("La mejor puntuada es: " + mejorPuntuada.getTitulo() + " con un puntaje de " + puntajeMaximo);
    }
}
