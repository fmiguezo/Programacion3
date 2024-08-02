public class ObservationException extends Exception {
    public ObservationException() {
        super("La observación no puede tener más de 30 caracteres.");
    }
}
