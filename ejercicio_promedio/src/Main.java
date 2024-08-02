public class Main {
    public static void main(String[] args) {
        Carrera ingenieria = new Carrera("Ingeniería", "L150");

        Materia matematica = new Materia("Matemática", "MAT001");
        Materia fisica = new Materia("Física", "FIS001");
        Materia quimica = new Materia("Química", "QUI001");

        Alumno alumno1 = new Alumno("Juan", "Pérez", 20, ingenieria);
        Alumno alumno2 = new Alumno("Ana", "González", 21, ingenieria);

        alumno1.agregarMateria(matematica);
        alumno1.agregarMateria(fisica);

        alumno2.agregarMateria(matematica);
        alumno2.agregarMateria(quimica);

        alumno1.agregarNota(matematica, 3.0);
        alumno1.agregarNota(matematica, 8.0);
        alumno1.agregarNota(fisica, 7.0);

        alumno2.agregarNota(matematica, 9.0);
        alumno2.agregarNota(quimica, 1.0);
        alumno2.agregarNota(quimica, 6.0);

        System.out.println("Promedio de " + alumno1.getNombre() + " en " + matematica.getNombre() + ": " + alumno1.promedioMateria(matematica));
        System.out.println(alumno1);

        System.out.println(alumno2);

    }
}