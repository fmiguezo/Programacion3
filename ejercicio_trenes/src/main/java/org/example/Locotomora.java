package org.example;

public class Locotomora {
    private double peso;
    private double pesoMaximo;
    private double velocidadMaxima;

    public Locotomora(double peso, double pesoMaximo, double velocidadMaxima) {
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double calcularArrastreUtil() {
        return this.pesoMaximo - this.peso;
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
