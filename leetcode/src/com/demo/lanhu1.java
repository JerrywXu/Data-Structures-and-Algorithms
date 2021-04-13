package com.demo;

import java.util.Scanner;

public class lanhu1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        String[] arr=str.split(",");
        String[] arr1=str1.split(",");
        int max=0;
        int a=0;
        int i=0;

    for (int j = 0; j < arr1.length; j++) {
        if(i<arr.length) {
        if (arr[i].equals(arr1[j])) {
            ++a;
            max = Math.max(a, max);
        }

        i=i+1;


    }
}


        System.out.print(max);
    }

}
