package org.example;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton instance;
    private int number;
    private String string;
    private List<String> list = new ArrayList<>();

    private Singleton() {
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

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List<String> getList() {
        return list;
    }

    public void addStringToList(String string){
        list.add(string);
    }
}
