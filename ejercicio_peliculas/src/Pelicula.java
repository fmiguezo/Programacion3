import java.time.LocalDate;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private Date fechaDeEstreno;
    private String paisDeOrigen;
    private int visualizaciones;

    // Constructor
    public Pelicula(String titulo, String descripcion, String fechaDeEstreno, String paisDeOrigen) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaDeEstreno = DateParser.parse(fechaDeEstreno);
        this.paisDeOrigen = paisDeOrigen;
        this.visualizaciones = 0;
    }

    // Métodos
    public void visualizar() {
        this.visualizaciones++;
    }

    public int calcularAniosDesdeEstreno() {
        LocalDate fechaActual = LocalDate.now();
        int anios = fechaActual.getYear() - fechaDeEstreno.getYear();
        return anios;
    }

    public int verPuntaje() {
        return visualizaciones * 1000 / this.calcularAniosDesdeEstreno() ;
    }

    // Getters y Setters
    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public Date getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public void setFechaDeEstreno(String fechaDeEstreno) {
        this.fechaDeEstreno = DateParser.parse(fechaDeEstreno);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Título: '" + titulo + " | fecha de estreno: " + fechaDeEstreno +  " | visualizaciones: " + visualizaciones + "\n";
    }
}
