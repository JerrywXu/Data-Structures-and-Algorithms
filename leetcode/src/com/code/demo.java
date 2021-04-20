package com.code;

public class demo {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,9,10},
                b[]={6,9,10,11,13,15},
                c[]={2,3,4,7,9,10};
        int d[] = new int[0],len=0;
        int i,j,k;
        //1
        for(i=0,j=0,k=0;i<a.length && j<b.length && k<c.length;){
            int aValue=a[i];
            int bValue=b[i];
            int cValue=c[i];
            if(aValue<=bValue && aValue<=cValue){
                d[len++]=aValue;
                i++;
            }else if(bValue<=cValue && bValue<=cValue){
                d[len++]=bValue;
                j++;
            }else if (cValue<=aValue && cValue<=bValue){
                d[len++]=cValue;
                k++;
            }
        }
        //2 等长
        if(i==a.length){
            for(;j<b.length && k<c.length;){
                int bValue=a[i];
                int cValue=c[k];
                if(bValue<=cValue){
                    d[++len]=bValue;
                    j++;
                }else{
                    d[len++]=cValue;
                    k++;
                }
            }
        }else if(j==b.length){
           // for()
        }

        //3 不等长
    }
}
