package com.demo;

public class statictest {
   static  int a;
   static  int b=1;
   static  int c=3;
   int d;
   int e=4;
   int f=5;

    public static void main(String[] args) {
        a=b;
        b=c;
        int d;
        int e=4;
        int f=5;

        d=e;
        e=f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

}
