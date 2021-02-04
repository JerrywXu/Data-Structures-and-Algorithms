package com.demo;

public class daxi {
    public static void main(String[] args) {

    }

    public static int superDigit(String n,int k){

        int j=Integer.parseInt(n);
        int sum=fun(j)*k;

        return sum;
    }

    public static int fun(int n){
        int ret = 0;
        if(n<10){
            return n;
        }
        return n%10 + fun(n/10);
    }

}
