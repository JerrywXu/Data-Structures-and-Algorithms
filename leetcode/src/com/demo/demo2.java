package com.demo;

import java.util.Scanner;

/**
 * Created by 徐纪伟 on 2020/8/8.
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int b=k;
            for(int m=0;m<b;m++)
            {
                if(k==3)
                {
                    break;
                }
                if (k % 2 == 1&& k!=3)
                {
                    j++;
                    k--;
                }
                k--;
            }
        }
        System.out.println(j);
    }
}
