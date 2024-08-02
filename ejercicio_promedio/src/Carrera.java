import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String codigo;
    private ArrayList<Materia> materias;

    public Carrera(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materias = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void mostrarMaterias() {
        for (Materia materia : materias) {
            System.out.println(materia.getNombre());
        }
    }
}
