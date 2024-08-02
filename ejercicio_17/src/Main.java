public class Main {
    public static void main(String[] args) {
        Objeto portafolios = new Objeto("portafolios" ,Material.CUERO, 1000);
        Objeto botiquin = new Objeto("botiquin", Material.PLASTICO, 500);
        Objeto gasa = new Objeto("gasa", Material.OTRO, 50);
        Objeto aguaOxigenada = new Objeto("agua oxigenada", Material.LIQUIDO, 100);
        Objeto bolsa = new Objeto("bolsa", Material.CUERO, 800);
        Objeto peine = new Objeto("peine", Material.PLASTICO, 50);
        Objeto botiquin2 = new Objeto("botiquin", Material.METAL, 500);

        Objeto mamushka1 = new Objeto("mamushka nivel 1", Material.MADERA, 100);
        Objeto mamushka2 = new Objeto("mamushka nivel 2", Material.MADERA, 80);
        Objeto mamushka3 = new Objeto("mamushka nivel 3", Material.MADERA, 60);
        Objeto mamushka4 = new Objeto("mamushka nivel 4", Material.MADERA, 40);
        Objeto mamushka5 = new Objeto("mamushka nivel 5", Material.MADERA, 20);

        mamushka4.agregarContenido(mamushka5);
        mamushka3.agregarContenido(mamushka4);
        mamushka2.agregarContenido(mamushka3);
        mamushka1.agregarContenido(mamushka2);

        botiquin.agregarContenido(gasa);
        botiquin.agregarContenido(aguaOxigenada);

        bolsa.agregarContenido(peine);
        bolsa.agregarContenido(botiquin2);

        Scanner scanner = new Scanner();
        scanner.escanearObjeto(mamushka1);
        scanner.escanearObjeto(portafolios);
        scanner.escanearObjeto(botiquin);
        scanner.escanearObjeto(bolsa);
    }
}