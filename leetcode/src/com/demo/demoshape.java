package com.demo;

import java.util.Scanner;

public class demoshape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] arr=str.split("," );

        int[] b=new int[arr.length];
        for(int j=0;j<b.length;j++){
            b[j]=Integer.parseInt(arr[j]);
        }
        System.out.println(circularArrayloop(b));
    }

    public static boolean circularArrayloop(int [] num){
        int n= num.length;

        for(int i=0;i<n;i++){
            num[i]=num[i]%n;
        }

        for(int i=0;i<n;i++){
            int f=num[i];

            if(f>=n)continue;;

            int j=i;
            int flag=n+i;
            int last=j;

            while(num[j]<n){
                if (f*num[j]<0)break;
                int next=(j+num[j]+n)%n;
                num[j]=flag;
                last = j;
                j=next;
            }
            if(num[j] == flag && j != last)return true;
        }
        return false;
    }



}
