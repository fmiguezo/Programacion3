package org.example;

public class SingletonCaller {
    public void calling(){
        System.out.println(Singleton.getInstance().getNumber());
    }
}
