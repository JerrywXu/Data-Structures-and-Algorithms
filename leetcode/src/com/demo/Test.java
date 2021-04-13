package com.demo;
    class Animal
    {
        String s_name = "pet";
        public Animal()
        {
            print();
        }
        public void print()
        {
            System.out.println("name=%s" + s_name);
        }
    }
    class Dog extends Animal
    {
        int i_age=10;

        public Dog(String name, int age)
        {
            s_name = name;
            i_age = age;
        }

        public void print()
        {
           System.out.println("name=" + s_name + ";age=" + i_age);
        }
    }
    public class Test {
        public static void print(Animal s) {
            s.print();
       }
        public static void main(String[] args)
        {
            Animal a = new Dog("Puppet", 5);
            //print(a);
            //a.print();
        }
    }


