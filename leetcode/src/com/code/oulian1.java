package com.code;

import java.util.Scanner;

public class oulian1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] arr=str.split(":" );

        int[] b=new int[arr.length];
        for(int j=0;j<b.length;j++){
            b[j]=Integer.parseInt(arr[j]);
        }
        int gw1=b[0]%10;
        int sw1=b[0]/10;
        int gw2=b[1]%10;
        int sw2=b[1]/10;

        int array[] = new int[4];
        array[0]=gw1;
        array[1]=sw1;
        array[2]=gw2;
        array[3]=sw2;
        int max=0;
        int min=array[0];
        for(int i=0;i<4;i++){
            max=Math.max(max,array[i]);
            min=Math.min(min,array[i]);
        }

        if(sw2*10+max>b[1]&&sw2*10+max<=60){

            System.out.print(b[0]+":"+(sw2*10+max));
        }else {

            System.out.print(b[0]+":"+(min*10+min));
        }


    }

}
