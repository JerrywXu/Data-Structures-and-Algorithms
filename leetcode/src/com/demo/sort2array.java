package com.demo;

public class sort2array {





    public void merge(int [] num1,int m, int [] num2,int n){
       int [] num1_copy=new int[m];
       System.arraycopy(num1,0,num1_copy,0,m);

       int p1=0;
       int p2=0;

       int p=0;

       while ((p1<m)&&(p2<n)){
           num1[p++]=(num1_copy[p1++]<num2[p2++])?num1_copy[p1++]:num2[p2++];

       }
       if(p1<m)
           System.arraycopy(num1_copy,p1,num1,p1+p2,m+n-p1-p2);

       if (p2<n)
           System.arraycopy(num1_copy,p2,num1,p1+p2,m+n-p1-p2);

    }

}
