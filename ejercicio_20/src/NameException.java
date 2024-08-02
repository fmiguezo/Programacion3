public class NameException extends Exception {
    public NameException() {
        super("El nombre del artículo no puede tener más de 15 caracteres.");
    }
}
