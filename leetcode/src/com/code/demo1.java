package com.code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class demo1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(zuichangzichuan(s));
    }


    public static int zuichangzichuan(String s){
        Set<Character> occ=new HashSet<Character>();
        int n=s.length();
        int rk=-1,ans=0;
        for (int i=0;i<n;i++){
            if (i!=0){
                occ.remove(s.charAt(i-1));
            }
            while (rk+1<n&&!occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk+1));
                ++rk;
            }
            ans=Math.max(ans,rk-i+1);
        }
        return ans;
    }
}