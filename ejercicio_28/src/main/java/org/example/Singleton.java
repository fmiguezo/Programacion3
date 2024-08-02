package org.example;

public class Singleton {
    private static Singleton instance;
    private int number;

    private Singleton(){}

    private Singleton(int number){
        this.number = number;
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
