package com.demo;

import java.util.Scanner;

public class yingtailai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int a[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        print(m,n,a);

    }
    public static void print(int m,int n,int[][] a){
        for (int k=0;k<n;k++){
            for(int i=0,j=k;i<m && j>=0;i++,j--){
                System.out.print(a[i][j]);
                System.out.print(",");
            }
        }

        //斜对角线以下部分
        for (int k=1;k<m;k++){
            for (int i=k,j=n-1;i<m && j>=0;i++,j--){
                System.out.print(a[i][j]);
                if (!(i==m-1&&j==n-1)){
                    System.out.print(",");
                }
            }
        }
    }
}
