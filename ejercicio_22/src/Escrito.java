import java.sql.Date;

public class Escrito implements Document {
    private int legajo;
    private Date erogacion;
    private String cuerpo;
    private String autor;

    public Escrito() {

    }

    public Escrito(int legajo, Date erogacion, String cuerpo, String autor) {
        this.legajo = legajo;
        this.erogacion = erogacion;
        this.cuerpo = cuerpo;
        this.autor = autor;
    }

    @Override
    public int getId() {
        return this.legajo;
    }

    @Override
    public Date getIssueDate() {
        return this.erogacion;
    }

    @Override
    public String getBody() {
        return this.cuerpo;
    }

    @Override
    public String getResponsible() {
        return this.autor;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setErogacion(Date erogacion) {
        this.erogacion = erogacion;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "Escrito:" + "\tLegajo: " + this.legajo+ "\tErogación: " + this.erogacion+ "\tCuerpo: " + this.cuerpo+ "\tAutor: " + this.autor;
    }
}
