package com.interview;

import java.util.Scanner;

public class maxSubLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] as=str.split(" ");
        String str1=as[0];
        String str2=as[1];
        char st1[]=new char[str1.length()];
        char st2[]=new char[str2.length()];
        for (int i=0;i<str1.length();i++){
            st1[i]=str1.charAt(i);
        }
        for (int i=0;i<str2.length();i++){
            st2[i]=str2.charAt(i);
        }
        maxSubLenth(st1,st2);

    }
    public static void maxSubLenth(char [] a,char[] b){
        int m=a.length;
        int n=b.length;
        int[][]len=new int[m+1][n+1];
        int[][]flag=new int[m+1][n+1];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                if(a[i]==b[j]){
                    len[i+1][j+1] = len[i][j] + 1;
                    flag[i+1][j+1] = 1;
                }else if(len[i+1][j]>=len[i][j+1]){
                    len[i+1][j+1] = len[i+1][j];
                    flag[i+1][j+1] = 2;
                }else {
                    len[i+1][j+1] = len[i][j+1];
                    flag[i+1][j+1]=3;
                }
            }
        }
        int k=len[m][n];
        char [] commomChar=new char[k];
        int i=m,j=n;
        for (;i>0&&j>0;){
            if (flag[i][j]==1){
                commomChar[k-1]=a[i-1];
                k--;
                i--;
                j--;
            }else if(flag[i][j]==2){
                j--;
            }else {
                i--;
            }
        }
        if(commomChar.length==0){
            System.out.print(-1);
        }
        else {
            for (int l = 0; l <= len[m][n] - 1; l++) {
                System.out.print(commomChar[l]);
            }
        }
    }
}
