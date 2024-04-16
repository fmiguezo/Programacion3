package ejercicio4_5;

import java.time.LocalTime;

public class Cine {
    // Atributos
    private String pelicula;
    private LocalTime horario;

    // Constructor

    public Cine() {
    }

    public Cine(String pelicula, LocalTime horario) {
        this.pelicula = pelicula;
        this.horario = horario;
    }

    // Métodos
    public String obtenerCartelera(){
        return this.pelicula + ": " + this.horario;
    }

    // Getters y setters
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
}
