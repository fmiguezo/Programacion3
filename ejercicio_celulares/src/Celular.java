public class Celular {
    // Atributos
    protected String modelo;
    protected boolean encendido;
    protected double bateria;
    protected double descarga;
    protected Servicio servicio;

    // Constructor
    public Celular() {
        new Celular("");
    }

    public Celular(String modelo) {
        this.modelo = modelo;
        this.encendido = false;
        this.bateria = 5.0;
        this.descarga = 0;
        this.servicio = new Servicio();
    }

    // Métodos
    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void cargarBateria() {
        this.bateria = 5;
    }

    public void descargar(){
        if (this.encendido && this.bateria > 0) {
            this.bateria -= this.descarga;
        } else if (!this.encendido || this.bateria == 0) {
            this.apagar();
        }
    }

    public void llamar(Persona receptor) {
        descargar();
        if (this.encendido) {
            servicio.establecerLlamada(receptor);
        } else {
            System.out.println("Celular sin bateria, no se puede establecer llamada.");
        }
    }

    public void recibirLlamada() {
        if (this.encendido && this.bateria > 0) {
            servicio.recibirLlamada();
            descargar();
        } else {
            System.out.println("El abonado no se encuentra disponible.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public double getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", encendido=" + encendido +
                ", bateria=" + bateria +
                '}';
    }
}