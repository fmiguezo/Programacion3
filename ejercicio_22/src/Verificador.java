import java.util.ArrayList;
import java.util.Date;

public class Verificador {
    public void verificar(ArrayList<Document> documents) {
        Date today = new Date();
        for (Document document : documents) {
            System.out.println(document);
            if (document.getId() != 0 && document.getIssueDate() != null && document.getBody().length() >= 10 && document.getResponsible() != null) {
                if (document.getIssueDate().before(today)) {
                    System.out.println("Aceptado.\n");
                } else {
                    System.out.println("Rechazado.\n");
                }
            } else {
                System.out.println("Rechazado.\n");
            }
        }
    }
}
