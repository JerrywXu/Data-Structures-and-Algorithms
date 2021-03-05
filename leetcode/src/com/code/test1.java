package com.code;

public class test1 {
    public static void main(String[] args) {
      Singleton.getInstance().doSomeSthing();
    }

public static class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static  synchronized  Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void doSomeSthing(){
        System.out.println("doSomething");
    }
}
}

