package com.demo;

import java.util.Scanner;

public class agora {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
//        String str="adsghaehfsaf32r1241";
        findFirst(str);

    }
    public  static void findFirst(String str){
        if(str == null){
            return;
        }
        int i=0;
        char[] arr =str.toCharArray();

        int [] hashTable = new int[256];
        for(i=0;i<256;i++){
            hashTable[i]=0;
        }

        char[] hashKey = arr;
        for(i=0;i<hashKey.length;i++){
            int temp = hashKey[i];//i中数的acii码值赋给temp
            hashTable[temp]++;//计数
        }

        for( i = 0;i<hashKey.length;i++){
            if(hashTable[hashKey[i]] ==1){
                System.out.println((char)hashKey[i]);
                return;
            }
        }
    }




}
