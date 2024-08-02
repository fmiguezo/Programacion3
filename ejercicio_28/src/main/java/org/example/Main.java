package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.setNumber(10);

        SingletonCaller caller = new SingletonCaller();
        caller.calling();
    }
}