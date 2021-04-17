package com.code;

import java.util.*;

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
    public boolean repeatedSubstringPattern (String s) {
        // write code here
        if(s==null||s.length()<=1){
            return false;
        }
        int length=s.length();

        for(int i=length/2;i>0;i--){
            if(length%i==0){
                StringBuilder sb=new StringBuilder();
                int c=length/i;
                String temp=s.substring(0,i);
                for (int j=0;j<c;j++){
                    sb.append(temp);
                }
                if (sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;

    }


    public ArrayList<ArrayList<String>> groupAnagrams (String[] strs) {
        // write code here
        Map<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
        for (String str:strs){
            char[] array=str.toCharArray();
            Arrays.sort(array);
            String key=new String(array);
            ArrayList<String> list=map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<ArrayList<String>>(map.values());
    }

}
