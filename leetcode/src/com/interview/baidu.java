package com.interview;

import java.util.Scanner;

/**
 * Created by 徐纪伟 on 2020/9/3.
 */
public class baidu {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String num1 = num.nextLine();
        String[] strArray=num1.split(" ");
        //int [] num2=new int[strArray.length];
        int x=Integer.parseInt(strArray[0]);
        int y=Integer.parseInt(strArray[1]);

        char[] str0=str.next().toCharArray();


        for(int i=0;i<str0.length;i++)
        {
            if(str0[i]=='u'||str0[i]=='U')
            {
                ++y;
            }
            if(str0[i]=='d'||str0[i]=='D')
            {
                --y;
            }
            if(str0[i]=='l'||str0[i]=='L')
            {
                --x;
            }
            if(str0[i]=='r'||str0[i]=='R')
            {
                ++x;
            }
        }
        str.close();
        num.close();//！！！！！用完记得关闭

        System.out.print(x+" "+y);



    }
}
    /*Exception in thread "main" java.util.NoSuchElementException
        at java.util.Scanner.throwFor(Scanner.java:862)
        at java.util.Scanner.next(Scanner.java:1371)
        at Main.main(Main.java:12)*/