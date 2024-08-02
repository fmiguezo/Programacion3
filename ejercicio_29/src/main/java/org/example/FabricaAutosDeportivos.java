package org.example;

public class FabricaAutosDeportivos implements FabricaAutos {
    @Override
    public Auto fabricarAuto() {
        Auto auto = new AutoDeportivo();
        auto.setAc(obtenerAireAcondicionado());
        auto.setRepr(obtenerReproductor());
        return auto;
    }

    @Override
    public AireAcondicionado obtenerAireAcondicionado() {
        return new AireAcondicionadoImportado();
    }

    @Override
    public Reproductor obtenerReproductor() {
        return new ReproductorImportado();
    }
}
