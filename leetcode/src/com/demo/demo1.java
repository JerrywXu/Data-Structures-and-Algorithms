package com.demo;

import java.util.Scanner;

/**
 *?????
 */
public class demo1 {
    public int test(){
        int a = 0;
        try{
            a++;
            throw new Exception("故意的");
        }catch(Exception exa){
            a++;
            return a;
        }finally{
            a++;
            System.out.println("a1 = "+a);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = new demo1().test();
        System.out.println("a2 = "+a);//return a了然后继续执行finally
    }
}

