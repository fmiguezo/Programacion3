import java.util.ArrayList;

public class Casa extends Inmueble {
    private boolean tieneQuincho;
    private boolean tienePileta;

    public Casa(Direccion direccion, Contacto contacto, ArrayList<Ambiente> ambientes, boolean tieneGasNatural, boolean tieneCloacas, boolean tieneQuincho, boolean tienePileta) {
        super(direccion, contacto, ambientes, tieneGasNatural, tieneCloacas);
        this.tieneQuincho = tieneQuincho;
        this.tienePileta = tienePileta;
    }
}
