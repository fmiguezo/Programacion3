import org.jetbrains.annotations.NotNull;

public class Celular implements ServicioTelefonico, Encendible, Cargable {
    // Atributos
    protected Modelo modelo;
    protected boolean encendido;
    protected Double bateria;

    // Constructor
    public Celular(@NotNull Modelo modelo) {
        this.modelo = modelo;
        this.encendido = false;
        this.bateria = modelo.getBateria();
    }

    // Getters
    public Modelo getModelo() {
        return this.modelo;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public double getBateria() {
        return this.bateria;
    }

    // Métodos
    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void cargar() {
        this.bateria = modelo.getBateria();
    }

    @Override
    public void descargar(){
        if (this.encendido && this.bateria > 0) {
            this.bateria -= modelo.getDescarga();
        } else if (!this.encendido || this.bateria == 0) {
            this.apagar();
        }
    }

    @Override
    public void llamar(@NotNull Persona receptor) {
        try {
            if (this.encendido && receptor.getCelular().isEncendido() && this.bateria > 0) {
                System.out.println("Llamando a " + receptor.getNombre() + "...");
                receptor.getCelular().recibir();
                descargar();
            } else if (this.encendido && !(receptor.getCelular().isEncendido()) && this.bateria > 0) {
                System.out.println("No se puede establecer llamada.");
            } else {
                System.out.println("Celular sin bateria.");
            }
        }
        catch (NullPointerException e) {
            System.out.println("No se puede realizar la llamada. " + receptor.getNombre() +  " no tiene celular.");
        }
    }

    @Override
    public void recibir() {
        if (this.encendido && this.bateria > 0) {
            System.out.println("Llamada establecida.");
            descargar();
        } else {
            System.out.println("El abonado no se encuentra disponible.");
        }
    }

    @Override
    public void finalizar(@NotNull Persona finalizado, Persona finalizador) {
        try {
            if (finalizado.getCelular().isEncendido()) {
                System.out.println("El celular de " + finalizado.getNombre() + " sigue encendido.");
            } else {
                System.out.println("El celular de " + finalizado.getNombre() + " está apagado.");
            }
            System.out.println("Finalizando llamada...");
            System.out.println("Nivel de bateria actual es de " + this.bateria + " puntos.");
            this.cargar();
        } catch (NullPointerException e) {
            System.out.println("No se realizó la llamada. " + finalizado.getNombre() + " no tiene celular.");
        }
    }
}