package com.interview;

import java.util.Scanner;

/**
 * Created by 徐纪伟 on 2020/9/26.
 */
public class i360 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String strArray[]=input.split(" ");
        int num[]=new int[strArray.length];
        for(int i=0;i<strArray.length;i++)
        {
            num[i]=Integer.parseInt(strArray[i]);
        }
        int a=num[0];
        int b=num[1];
        int k=num[2];
        int v=num[3];

        if(b*k*v>=a)
        {System.out.println(b);}
        else
        {System.out.println(a-b*k*v+b);}
    }
}
