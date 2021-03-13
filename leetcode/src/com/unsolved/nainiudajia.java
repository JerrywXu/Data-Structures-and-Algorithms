package com.unsolved;

import java.util.*;


public class nainiudajia {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 最大牛奶桶数
     * @param grass int整型一维数组 吃的草的捆数
     * @param milk int整型一维数组 产的牛奶桶数
     * @return int整型
     */
    public static void main(String[] args) {
        int [] grass={2,3,4,5,6};
        int [] milk ={2,4,7,9,12};
        System.out.println(MaxMilk(grass,milk));

    }
    public static int MaxMilk (int[] grass, int[] milk) {
        // write code here
        int sum=0;
        int g=grass.length;
        int m=milk.length;
       do{
            if(grass[m-1]<milk[m-1]&&grass[m]>milk[m]){
                milk[m]=0;
            }
            m--;
        } while (m!=0);
        for(int j=0;j<m;j++){
            sum=sum+milk[j];
        }
        return sum;

    }
}