package com.code;
//跳跃游戏
//2,3,1,1,4
//3,2,1,0,4
import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class arrayjump {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next().toString();
        String [] arr =str.split(",");
        int [] b=new  int[arr.length];
        for (int j=0;j<b.length;j++){
            b[j] =Integer.parseInt(arr[j]);
        }
        System.out.println(canJump(b));
    }

    public static boolean canJump(int [] a){
        int maxN=0;
        int i=0;
        while (i<=maxN){
            maxN=max(maxN,i+a[i]);//贪心算法，维护一个能跳跃的最大长度
            i++;
            if(maxN>=a.length-1){
                return true;
            }
        }
        return false;
    }
}
