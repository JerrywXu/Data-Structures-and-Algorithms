package com.demo;

public class daxi {
    public static void main(String[] args) {

        System.out.println(superDigit("9875",4));
    }

    public static int superDigit(String n,int k){
        int j=Integer.parseInt(n);
        int sum=sum(j)*k;

        if(sum>=10){
            sum=sum(sum);
        }
       return sum;
    }

    public static int sum(int n){
        int sum=0;
        while(n!=0){ //循环调用求一个数各个位数的和
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

}
