import java.sql.Date;

public  interface Document {

    public int getId();

    public Date getIssueDate();

    public String getBody();

    public String getResponsible();

}
