package com.demo;

import java.util.Scanner;

public class gongyueshumax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] arr=str.split(",");
        int[] b=new int[arr.length];
        for(int j=0;j<b.length;j++){
            b[j]=Integer.parseInt(arr[j]);
        }

        int a=b[0];
        int c=b[1];
        System.out.println(GCD(a,c));


    }
    public static  int GCD(int m,int n){
        int result=0;
        while (n!=0){
            result=m%n;
            m=n;
            n=result;
        }
        return m;
    }
}
