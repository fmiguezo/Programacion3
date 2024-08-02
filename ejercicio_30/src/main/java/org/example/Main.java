package org.example;

public class Main {
    public static void main(String[] args) {
        PostreBuilder builder = new TortaDeLaMuerteBuilder();
        TortaDeLaMuerte torta = ((TortaDeLaMuerteBuilder) builder).getPostre();

        System.out.println("Torta de la muerte:");

    }
}