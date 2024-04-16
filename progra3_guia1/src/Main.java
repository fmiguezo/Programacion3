// import clase1.Gato;
// import ejercicio1.Persona;
// import ejercicio2.Vehiculo;
// import ejercicio3.Articulo;
// import ejercicio4_5.Cine;
// import ejercicio6.Fruta;
// import ejercicio7.Ninja;
import ejercicio8_10.Persona;
// import ejercicio8_10.Guardia;
// import ejercicio8_10.Visitante;
import ejercicio9_10_11_12.Guardia;
import ejercicio9_10_11_12.Visitante;

// import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
      /*
        // Clase 1

        System.out.println("Hello world!");
        
        clase1.Gato gatoMichi = new clase1.Gato("Michi", 7);
        gatoMichi.setColor("Marrón");
        gatoMichi.setPeso(3.5);

        clase1.Gato gatoNaranja = new clase1.Gato("Naranja", 5);
        gatoNaranja.setColor("Naranja");
        gatoNaranja.setPeso(3);

        System.out.println("--------------------------------------");
        System.out.println("El nombre del gato es: " + gatoMichi.getNombre());
        System.out.println(gatoMichi);
        System.out.println("El peso del gato es: " + gatoMichi.getPeso());
        gatoMichi.comer(2);
        System.out.println("El peso del gato después de comer es: " + gatoMichi.getPeso());
        gatoMichi.jugar(3);
        System.out.println("El peso del gato después de  jugar es: " + gatoMichi.getPeso());


        System.out.println("--------------------------------------");
        System.out.println("El nombre del gato es: " + gatoNaranja.getNombre());
        System.out.println(gatoNaranja);




        // Ejercicio 1
        ejercicio8.Persona florencia = new ejercicio8.Persona();
        florencia.nombre = "Florencia";
        florencia.apellido = "Miguez";
        System.out.println(florencia.nombre + " " + florencia.apellido);

        // Ejercicio 2
        Vehiculo auto = new Vehiculo();
        auto.marca = "Ford";
        auto.modelo = "Fiesta";
        auto.setPatente("AAA111");
        System.out.println(auto.marca + " " + auto.modelo + " " + auto.getPatente());

        // Ejercicio 3
        Articulo mouse = new Articulo();
        mouse.setMarca("Logitech");
        mouse.setModelo("Lift");
        mouse.modelo();
        mouse.marca();
        System.out.println(mouse.toString());

        // Ejercicio 4 y 5
        Cine showcase = new Cine();
        showcase.setPelicula("Los Increibles");
        showcase.setHorario(LocalTime.now());
        System.out.println(showcase.obtenerCartelera());

        Cine cinemark = new Cine();
        cinemark.setPelicula("La nueva de Wes Anderson");
        cinemark.setHorario(LocalTime.now());
        System.out.println(cinemark.obtenerCartelera());

        showcase.setPelicula("Los Increibles 2");
        showcase.setHorario(LocalTime.MIDNIGHT);
        System.out.println(showcase.obtenerCartelera());

        // Ejercicio 6
        Fruta manzana = new Fruta();
        manzana.setColor("verde");
        manzana.setPeso(250);
        System.out.println(manzana);

        Fruta frutilla = new Fruta("rojo", 20, true);
        System.out.println(frutilla);

        // Ejercicio 7
        Ninja ninja1 = new Ninja();
        Ninja ninja2 = new Ninja();

        ninja1.setArma("Katana");
        ninja1.setArteMarcial("Karate");
        ninja1.setFuerza(10);
        ninja1.setSalto(5);

        ninja2.setArma("Shuriken");
        ninja2.setArteMarcial("Jiu Jitsu");
        ninja2.setFuerza(8);
        ninja2.setSalto(7);

        ninja1.ataque();
        ninja1.saltar(2);

        ninja2.ataque();
        ninja2.saltar(3);

        // Ejercicio 8
        Persona persona = new Persona("Florencia", "Miguez");
        Guardia guardia = new Guardia("Juan", "Perez");
        Visitante visitante = new Visitante("Pedro", "Gomez");

        System.out.println(persona);
        System.out.println(guardia);
        System.out.println(visitante);
*/
        // Ejercicio 9, 10 y 11
        Guardia guardia = new Guardia("Juan", "Perez"); // si no creo el constructor en la clase hija no reconoce los atributos
        Visitante visitante = new Visitante("Pedro", "Gomez");

        Guardia guardia1 = new Guardia();
        Visitante visitante1 = new Visitante();

        guardia1.setNombre("Juan");
        guardia1.setApellido("Perez");

        visitante1.setNombre("Pedro");
        visitante1.setApellido("Gomez");

        System.out.println(guardia1);
        System.out.println(visitante1);

        System.out.println(guardia1.presentarse());

        visitante1.setDni("12345678");

        // 11
        System.out.println(guardia1.controlarDocumento(visitante1.getDni()));

        // 12
        System.out.println(guardia1.controlarDocumento(visitante1.getNombreCompleto(), visitante1.getDni()));

    }
}