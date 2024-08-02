import java.util.Comparator;

public class ComparadorVisualizaciones implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if (p1.getVisualizaciones() == p2.getVisualizaciones()) {
            return 0;
        } else if (p1.getVisualizaciones() > p2.getVisualizaciones()) {
            return 1;
        } else {
            return -1;
        }
    }
}
