package org.example;

public class PasteleroDeHorror {
    private PostreBuilder receta;

    public PasteleroDeHorror(PostreBuilder receta) {
        this.receta = receta;
    }

    public void cambiarReceta(PostreBuilder receta) {
        this.receta = receta;
    }

}
