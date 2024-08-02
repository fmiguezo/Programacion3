import java.sql.Date;

public class Documento implements Document {
    private int expediente;
    private Date lanzamiento;
    private String contenido;
    private String nombre;

    public Documento() {

    }

    public Documento(int expediente, Date lanzamiento, String contenido, String nombre) {
        this.expediente = expediente;
        this.lanzamiento = lanzamiento;
        this.contenido = contenido;
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return this.expediente;
    }

    @Override
    public Date getIssueDate() {
        return this.lanzamiento;
    }

    @Override
    public String getBody() {
        return this.contenido;
    }

    @Override
    public String getResponsible() {
        return this.nombre;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Documento:" + "\tExpediente: " + this.expediente+ "\tLanzamiento: " + this.lanzamiento+ "\tContenido: " + this.contenido+ "\tNombre: " + this.nombre;
    }
}
