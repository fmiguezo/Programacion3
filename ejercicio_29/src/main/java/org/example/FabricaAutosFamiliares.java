package org.example;

public class FabricaAutosFamiliares implements FabricaAutos {
    @Override
    public Auto fabricarAuto() {
        Auto auto = new AutoFamiliar();
        auto.setAc(obtenerAireAcondicionado());
        auto.setRepr(obtenerReproductor());
        return auto;
    }

    @Override
    public AireAcondicionado obtenerAireAcondicionado() {
        return new AireAcondicionadoNacional();
    }

    @Override
    public Reproductor obtenerReproductor() {
        return new ReproductorNacional();
    }

}
