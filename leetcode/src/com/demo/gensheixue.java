package com.demo;

import java.util.Scanner;

public class gensheixue {
    static int RMB[]={100,50,20,10,5,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int res[][]=find(n);
            while (n>0){
                System.out.print(res[1][n]);
                n=n-res[1][n];
            }
        }

    }
    public static int[][] find(int n){
        int s[][]=new int[2][n+1];
        s[0][0]=0;

        for (int i=1;i<=n;i++){
            int q=n;
            int k=0;
            for(k=5;k>=0&&RMB[k]>n;k--);
            for (int j=0;j<=k;j++){
                if(i>=RMB[j]&&q>=1+s[0][i-RMB[j]]){
                    q=1+s[0][i-RMB[j]];
                    s[1][i]=RMB[j];
                }
            }
            s[0][i]=q;
        }
        return s;
    }
}
