import java.util.ArrayList;

public class CalculadorNotas {

    public double promedioMateria(Alumno alumno, Materia materia) {
        ArrayList<Double> notas = alumno.getMaterias().get(materia);
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public double promedioGeneral(Alumno alumno) {
        double suma = 0;
        int cantidad = 0;
        for (Materia materia : alumno.getMaterias().keySet()) {
            suma += this.promedioMateria(alumno, materia);
            cantidad++;
        }
        return suma / cantidad;
    }
}
