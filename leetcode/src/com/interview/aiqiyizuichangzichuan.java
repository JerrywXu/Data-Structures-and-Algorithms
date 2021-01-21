package com.interview;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 无重复的最长子串
 */
public class aiqiyizuichangzichuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        aiqiyizuichangzichuan de=new aiqiyizuichangzichuan();
        System.out.println(de.lenth(s));
        sc.close();
    }
    public  int lenth(String s) {
        int n = s.length();
        int num = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (yanzheng(s, i, j))
                {
                    num = Math.max(num, j - i);//把之前的数与每一次循环的数做对比
                }
            }
        }
        return num;
    }
    public boolean yanzheng(String s,int start,int end)
    {
        Set<Character> set=new HashSet<>();
        for(int i=start;i<end;i++)
        {
            Character ch=s.charAt(i);
            if(set.contains(ch))//对比添加的元素里面有没有重复的
            {
                return false;
            }
            set.add(ch);//刚开始向里面添加元素
        }
        return true;
    }
}

