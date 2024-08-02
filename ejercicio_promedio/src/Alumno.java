import java.util.ArrayList;
import java.util.HashMap;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private Carrera carrera;
    private HashMap<Materia, ArrayList<Double>> materias;

    public Alumno(String nombre, String apellido, int edad, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = new HashMap<Materia, ArrayList<Double>>();
    }

    // Métodos
    public void agregarMateria(Materia materia) {
        this.materias.put(materia, new ArrayList<Double>());
    }

    public void agregarNota(Materia materia, double nota) {
        this.materias.get(materia).add(nota);
    }

    public int cantidadMaterias() {
        return this.materias.size();
    }

    public double promedioMateria(Materia materia) {
        return new CalculadorNotas().promedioMateria(this, materia);
    }

    public double promedioGeneral() {
        return new CalculadorNotas().promedioGeneral(this);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public HashMap<Materia, ArrayList<Double>> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " " + this.apellido + "\n" +
                "Carrera: " + this.carrera.getNombre() + "\n" +
                "Promedio general: " + this.promedioGeneral();
    }
}
