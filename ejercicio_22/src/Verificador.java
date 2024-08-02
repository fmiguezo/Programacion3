import java.util.ArrayList;

public class Normalizador {
    public void normalizar(ArrayList<Document> documents) {
        for (Document document : documents) {
            if (document.getId() != 0 && document.getIssueDate() != null && !document.getBody().equals("") && !document.getResponsible().equals("") {


            } else {
                System.out.println("Rechazado");
            }
        }
    }
}
