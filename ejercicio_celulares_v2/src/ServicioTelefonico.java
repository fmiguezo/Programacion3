public interface ServicioTelefonico {

    void llamar(Persona receptor);

    void recibir();

    void finalizar(Persona receptor, Persona emisor);

}
