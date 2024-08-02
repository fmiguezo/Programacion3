public class Direccion {
    private String provincia;
    private String barrio;
    private String calle;
    private int altura;
    private String codigoPostal;
    private boolean barrioPrivado;

    public Direccion(String provincia, String barrio, String calle, int altura, String codigoPostal, boolean barrioPrivado) {
        this.provincia = provincia;
        this.barrio = barrio;
        this.calle = calle;
        this.altura = altura;
        this.codigoPostal = codigoPostal;
        this.barrioPrivado = barrioPrivado;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCalle() {
        return calle;
    }

    public int getAltura() {
        return altura;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public boolean isBarrioPrivado() {
        return barrioPrivado;
    }
}
