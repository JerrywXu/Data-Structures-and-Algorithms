package com.code;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc1.nextInt();
        int sum=0;
        for(int i=a;i<b;i++){
            if(isP(i)){
                sum++;
            }
        }
        System.out.print(sum);
    }
    public static boolean isP(int n){
        for (int i=2;i<n;i++){
            if(n%i==0)
                return false;

        }
        return true;
    }
}
