package org.example;

public class ArbolGenealogico {
    private PersonaComposite raiz;

    public ArbolGenealogico(PersonaComposite raiz) {
        this.raiz = raiz;
    }

    public void imprimir() {
        raiz.imprimirDatos();
    }
}
