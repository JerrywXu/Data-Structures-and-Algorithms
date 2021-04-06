package com.demo;

import java.util.Scanner;

public class F360 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int d=sc1.nextInt();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int[] b=new int[arr.length];
        for(int j=0;j<b.length;j++){
            b[j]=Integer.parseInt(arr[j]);
        }
        if(d==b.length) {
            System.out.println(score(d, b));
        }else{
            System.out.println("输入有误请重新检查");
        }

    }
    public static int score(int nums,int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            for (int j=1;j<i;j++){
                sum=sum+a[i]|a[j];
            }
        }
        return sum;
    }
}
