package com.demo;

public class boss {
    //int 数组
    //元素代表第i天股票价格
    //允许有一次   买入  与一次   卖出
    //计算股票最大收益
    public static void main(String[] args) {
        int[] a={100,30,1};
        System.out.print(maxMoney(a));

    }

    public static int maxMoney(int [] a){
        if(a.length<2||a==null){
            return -1;
        }
        int min=a[0];

        int max=a[1]-min;
        for(int i=1;i<a.length;i++){
            if(a[i-1]<min){
                min=a[i-1];
            }
            if(a[i]-min>max){
                max=a[i]-min;
            }
        }

        return max;
    }

}
