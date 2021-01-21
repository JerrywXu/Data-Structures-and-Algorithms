package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 徐纪伟 on 2020/9/13.
 */
public class aiqiyisanshuzhihe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String strArry[]=input.split(" ");//定义一个字符串数组以空格分隔
        int num[]=new int[strArry.length];//开辟一个字符串空间
        for(int i=0;i<strArry.length;i++)
        {
            num[i]=Integer.parseInt(strArry[i]);//遍历字符串并转成int类型
        }
        solution so=new solution();
        System.out.println(so.zuiduoyuansu(num));
    }
}
class solution{
    public int zuiduoyuansu(int[] num){
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<num.length;i++)
        {
            int times=0;
            if(map.containsKey(num[i]))
            {
                continue;
            }
            for (int j=i;j<num.length;j++)
            {
                if (num[j] == num[i])
                {
                    times++;
                }

            }
            map.put(num[i],times);
            if(map.get(num[i])>(num.length/2))
            {
                return  num[i];
            }
        }
        return 0;
    }
}
