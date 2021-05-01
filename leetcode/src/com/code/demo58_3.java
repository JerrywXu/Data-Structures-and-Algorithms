package com.code;

public class demo58_3 {
    public static void main(String[] args) {

    }
    public int[] mergePrice (int[] a, int[] b) {
        // write code here
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if(a[i]>=b[j]){
                c[k++]=b[j++];
            }else {
                c[k++]=a[i++];
            }
        }

        while (j<b.length){
            c[k++]=b[j++];
        }
        while (i<a.length){
            c[k++]=a[i++];
        }

        return c;
    }
}
