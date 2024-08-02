import java.util.ArrayList;

public class Inmueble {
    protected Direccion direccion;
    protected Contacto contacto;
    protected ArrayList<Ambiente> ambientes;
    protected boolean tieneGasNatural;
    protected boolean tieneCloacas;
    protected String observaciones;

    public Inmueble(Direccion direccion, Contacto contacto, ArrayList<Ambiente> ambientes, boolean tieneGasNatural, boolean tieneCloacas) {
        this.direccion = direccion;
        this.contacto = contacto;
        this.ambientes = ambientes;
        this.tieneGasNatural = tieneGasNatural;
        this.tieneCloacas = tieneCloacas;
    }


    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public ArrayList<Ambiente> getAmbientes() {
        return ambientes;
    }

    public boolean tieneGasNatural() {
        return tieneGasNatural;
    }

    public boolean tieneCloacas() {
        return tieneCloacas;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
