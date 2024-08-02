public class Scanner {
    public void escanearObjeto(Objeto objeto) {
        System.out.println("------ Escaneando objeto... ------");
        if (!objeto.verContenido().isEmpty()) {
            objeto.setTipo(Tipo.CONTENEDOR);
            System.out.println(objeto + " Contiene: ");
            for (Objeto contenido : objeto.verContenido()) {
                this.escanearContenido(contenido);
            }
        } else {
            objeto.setTipo(Tipo.SIMPLE);
            System.out.println(objeto + " No contiene nada.");
        }
        System.out.println("------ Escaneo completado. ------\n");
    }

    private void escanearContenido(Objeto objeto) {
        if (!objeto.verContenido().isEmpty()) {
            objeto.setTipo(Tipo.SAMBUCHITO);
            System.out.println(objeto + " Contiene: ");
            for (Objeto contenido : objeto.verContenido()) {
                this.escanearContenido(contenido);
            }
        } else {
            objeto.setTipo(Tipo.CONTENIDO);
            System.out.println(objeto + " No contiene nada.");
        }
    }


}
