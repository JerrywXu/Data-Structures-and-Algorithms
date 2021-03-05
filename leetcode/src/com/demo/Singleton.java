package com.demo;
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void  doSomething(){
        System.out.println("doSomething");
    }
    public static void  main(String args[]){
        Singleton.getInstance().doSomething();
    }
}

