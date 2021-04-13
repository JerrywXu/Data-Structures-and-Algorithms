package com.demo;

import java.util.Scanner;

public class lanhu3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<=10000;i++){
            for (int j =0;j<=10000;j++){
                for (int k=0;k<=10000;k++){
                    if(7*i+13*j+29*k==0){
                        System.out.print(true);
                    }
                    else {
                        System.out.print(false);
                    }
                }
            }
        }
    }


}
