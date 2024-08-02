public class Articulo {
    private String nombre;
    private double costo;
    private String observacion = "";

    public Articulo(String nombre, double costo) throws NameException, CostException {
        this.nombre = validarNombre(nombre);
        this.costo = validarCosto(costo);
    }

    public Articulo(String nombre, double costo, String observacion) throws NameException, CostException, ObservationException{
        this(nombre, costo);
        this.observacion = validarObservacion(observacion);
    }

    public String validarNombre(String nombre) throws NameException {
        if (nombre.length() <= 15) {
            return nombre;
        } else {
            throw new NameException();
        }
    }

    public double validarCosto(double costo) throws CostException {
        if (costo > 0) {
            return costo;
        } else {
            throw new CostException();
        }
    }

    public String validarObservacion(String observacion) throws ObservationException {
        if (observacion.length() <= 50) {
            return observacion;
        } else {
            throw new ObservationException();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) throws CostException {
        this.costo = validarCosto(costo);
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) throws ObservationException {
        this.observacion = validarObservacion(observacion);
    }

}
