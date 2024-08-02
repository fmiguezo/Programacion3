import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Escrito escrito = new Escrito(123, new Date(2020 - 1990, 1, 1), "Cuerpo del escrito", "Autor del escrito");
        Documento documento = new Documento(456, new Date(2020 - 1990, 1, 1), "Contenido del documento", "Nombre del documento");
        Ley ley = new Ley(789, new Date(2020 - 1990, 1, 1), "Desarrollo de la ley", "Firmante de la ley");
        Escrito escrito2 = new Escrito();

        ArrayList<Document> documents = new ArrayList<>();
        documents.add(escrito);
        documents.add(documento);
        documents.add(ley);
        documents.add(escrito2);

        Verificador verificador = new Verificador();
        verificador.verificar(documents);

    }
}