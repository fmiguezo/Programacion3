package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        instance.setNumber(7);
        instance.setString("Hello World!");
        instance.addStringToList("First element");

        System.out.println(instance.getNumber() + " - " + instance.getString());
    }
}