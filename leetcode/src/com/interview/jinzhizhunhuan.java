package com.interview;

import java.util.Scanner;

public class jinzhizhunhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        jinzhizhunhuan jz=new jinzhizhunhuan();
        System.out.println(jz.changeFormatNumber(number));

    }
    public String changeFormatNumber (String number) {
        // write code here
        int sum;
        String result=""; //二进制结果
        String result1="";  //十六进制结果
        char []b ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int number1= Integer.parseInt(number);
        int number2= Integer.parseInt(number);
        for(int i=number1 ; i>=1 ; i=i/2){   //二进制
            if(i/2==0){
                sum=0;
            }else{
                sum=1;
            }
            result = sum + result;
        }
        //System.out.println(b[number2 % 16]);

        //StringBuffer s=new StringBuffer();
        StringBuilder s=new StringBuilder();
       // System.out.println(number2);
        while(number2 != 0){//16进制转换
            s= s.append(b[number2 % 16]);
            number2 = number2 / 16;
        }
        result1=s.reverse().toString();

        //System.out.println(result1);
        return result+","+result1;



    }




    /**
     * 字符串前面补零操作
     *
     * @param str         字符串本体
     * @param totalLenght 需要的字符串总长度
     * @return
     */
    public static String splicingZero(String str, int totalLenght) {
        int strLenght = str.length();
        String strReturn = str;
        for (int i = 0; i < totalLenght - strLenght; i++) {
            strReturn = "0" + strReturn;
        }
        return strReturn;
    }
}