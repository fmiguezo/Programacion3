public class Main {
    public static void main(String[] args) {
        // Crear una lista de películas
        Cartelera cartelera = new Cartelera();

        // Agregar películas a la lista
        Pelicula pelicula1 = new Pelicula("El Padrino", "Un clásico del cine", "1972-03-24", "Estados Unidos");
        Pelicula pelicula2 = new Pelicula("El Padrino II", "La secuela del clásico", "1974-12-20", "Estados Unidos");
        Pelicula pelicula3 = new Pelicula("El Padrino III", "La tercera parte de la saga", "1990-12-25", "Estados Unidos");
        Pelicula pelicula4 = new Pelicula("El Padrino IV", "La cuarta parte de la saga", "2022-12-25", "Estados Unidos");
        Pelicula pelicula5 = new Pelicula("El Padrino V", "La quinta parte de la saga", "2024-12-25", "Estados Unidos");

        cartelera.agregarPelicula(pelicula1);
        cartelera.agregarPelicula(pelicula2);
        cartelera.agregarPelicula(pelicula3);
        cartelera.agregarPelicula(pelicula4);
        cartelera.agregarPelicula(pelicula5);

        // Visualizar películas
        pelicula1.visualizar();
        pelicula1.visualizar();
        pelicula1.visualizar();
        pelicula2.visualizar();
        pelicula3.visualizar();
        pelicula3.visualizar();
        pelicula3.visualizar();
        pelicula3.visualizar();
        pelicula4.visualizar();
        pelicula4.visualizar();

        // Imprimir películas
        cartelera.obtenerMejorPuntuada();

        System.out.println("---------- Peliculas por visualizaciones (Asc) ----------");
        cartelera.ordernarPorVisualizaciones(Orden.ASC);
        cartelera.imprimirPeliculas();

        System.out.println("---------- Peliculas por fecha de estreno (Desc) ----------");
        cartelera.ordenarPorFecha(Orden.DESC);
        cartelera.imprimirPeliculas();

    }
}