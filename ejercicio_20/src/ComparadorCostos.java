import java.util.Comparator;

public class ComparadorCostos implements Comparator<Articulo> {
    @Override
    public int compare(Articulo a1, Articulo a2) {
        if (a1.getCosto() < a2.getCosto()) {
            return -1;
        } else if (a1.getCosto() > a2.getCosto()) {
            return 1;
        } else {
            return 0;
        }
    }
}
