package com.demo;

public class SimpleFactoryMode {
    public static void main(String[] args) {
        HumanFactory bagualu = new HumanFactory();
        Human blackMan = bagualu.createHuman(BlackHuman.class); //黑人诞生了
        Human yellowMan = bagualu.createHuman(YellowHuman.class); //黄人诞生了
        Human whiteMan = bagualu.createHuman(WhiteHuman.class); //白人诞生了
        blackMan.talk();
    }
}
interface Human {
    void getColor();

    void talk();
}

class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑人是黑皮肤。");
    }

    public void talk() {
        System.out.println("黑人说黑人话。");
    }
}

class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白人是白皮肤。");
    }

    public void talk() {
        System.out.println("白人说白人话。");
    }
}

class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人是黄皮肤。");
    }

    public void talk() {
        System.out.println("黄种人说黄种人话。");
    }
}

class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> clazz) {
        //<T extends  Human> 是说明这个T是会继承 Human，可以调用 Human里的东西
        //同时这个泛型可以有一个createHuman方法，参数为指定类方法中的类泛型
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}