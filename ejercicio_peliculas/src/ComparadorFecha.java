import java.util.Comparator;

public class ComparadorFecha implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if (p1.getFechaDeEstreno().isBefore(p2.getFechaDeEstreno())) {
            return -1;
        } else if (p1.getFechaDeEstreno().isAfter(p2.getFechaDeEstreno())) {
            return 1;
        } else {
            return 0;
        }
    }
}
