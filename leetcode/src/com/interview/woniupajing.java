package com.interview;

import java.util.Scanner;

/**
 * Created by 徐纪伟 on 2020/8/14.
 */
public class woniupajing {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        //从键盘读取井深n的值
        System.out.println("请输入井的深度n米:");
        Scanner sc1=new Scanner(System.in);
        double n=sc1.nextDouble();
        //从键盘读取蜗牛白天爬的距离x米
        System.out.println("请输入蜗牛白天爬的距离X米:");
        Scanner sc2=new Scanner(System.in);
        double x=sc2.nextDouble();
        //从键盘读取蜗牛晚上下降的距离y米
        System.out.println("请输入晚上蜗牛下坠的距离y:");
        Scanner sc3=new Scanner(System.in);
        Double y=sc3.nextDouble();

        double sum=0;
        int day=1;
        while(true){
            sum+=x;//白天能到达的高度
			/*
			 * 用if选择结构，来判断蜗牛白天能不能爬出井，如果能则输出结果，
			 * 否则执行else蜗牛晚上下降并且天数加一。
			 */
            if(sum>=n){
                System.out.println("蜗牛第"+day+"天能从井里爬出来");
                break;
            }
            else{
                sum-=y;
                day++;
            }

        }

    }
}
