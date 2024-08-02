import java.sql.Date;

public class Ley implements Document {

    private int folio;
    private Date emision;
    private String desarrollo;
    private String firmante;

    public Ley() {

    }

    public Ley(int folio, Date emision, String desarrollo, String firmante) {
        this.folio = folio;
        this.emision = emision;
        this.desarrollo = desarrollo;
        this.firmante = firmante;
    }

    @Override
    public int getId() {
        return this.folio;
    }

    @Override
    public Date getIssueDate() {
        return this.emision;
    }

    @Override
    public String getBody() {
        return this.desarrollo;
    }

    @Override
    public String getResponsible() {
        return this.firmante;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setEmision(Date emision) {
        this.emision = emision;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public void setFirmante(String firmante) {
        this.firmante = firmante;
    }

    public String toString() {
        return "Ley:" + "\tFolio: " + this.folio+ "\tEmisión: " + this.emision+ "\tDesarrollo: " + this.desarrollo+ "\tFirmante: " + this.firmante;
    }
}
