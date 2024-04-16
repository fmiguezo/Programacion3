public class Servicio {

    public void establecerLlamada(Persona receptor) {
        System.out.println("Estableciendo llamada.");
        receptor.getCelular().recibirLlamada();
    }

    public void recibirLlamada() {
        System.out.println("Llamada establecida.");
    }
}
