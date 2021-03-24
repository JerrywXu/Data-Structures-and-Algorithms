package com.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class pukepaishuzi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String[] string =input.split(",");
        int [] num=new int[string.length];
        for (int i=0;i<string.length;i++){
            num[i]=Integer.parseInt(string[i]);

        }

//        for (int i=0;i<5;i++){
//            num[i]=sc.nextInt();
//        }
        System.out.print(isShunzi(num));

    }
    public static boolean isShunzi(int [] num){
        int count = 0;
        for(int i=0;i<num.length;i++){
            if (num[i]==0){
                count++;
            }
        }
        Arrays.sort(num);
        if(count == 0){
            for(int i=0;i<num.length-1;i++){
                if (num[i+1]!= num[i]+1){
                    return false;
                }
            }
        }else  if(count == 1){
            for(int i=0;i<num.length-1;i++){
                if (num[i+1]!= num[i]+1&&num[i+1]!=num[i]+2){
                    return false;
                }
        }
        }else if (count == 2){
            for(int i=2;i<num.length-1;i++){
                if (num[i+1]!= num[i]+1 && num[i+1]!=num[i]+2 && num[i+1]!= num[i]+3){
                    return false;
                }
        }

    }
        return true;
}
}
