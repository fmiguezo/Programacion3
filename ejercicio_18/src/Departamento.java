import java.util.ArrayList;

public class Departamento extends Inmueble {
    private int piso;
    private String departamento;
    private boolean admiteMascotas;

    public Departamento(Direccion direccion, Contacto contacto, ArrayList<Ambiente> ambientes, boolean tieneGasNatural, boolean tieneCloacas, int piso, String departamento, boolean admiteMascotas) {
        super(direccion, contacto, ambientes, tieneGasNatural, tieneCloacas);
        this.piso = piso;
        this.departamento = departamento;
        this.admiteMascotas = admiteMascotas;
    }
}
