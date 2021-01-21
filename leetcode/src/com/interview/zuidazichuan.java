package com.interview;

/**
 * Created by 徐纪伟 on 2020/8/11.
 */
public class zuidazichuan {
            public static void main(String[] args) {
            String s1="abbbcdef";
            String s2="xvxsadbbbcdef";
            int array[][]=new int[s1.length()][s2.length()];
            for (int i = 0; i < s1.length(); i++) {//init
                for (int j = 0; j < s2.length(); j++) {
                    if(s1.charAt(i)==s2.charAt(j)) array[i][j]=1;
                    else array[i][j]=0;
                }
            }
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if(i-1>=0&&j-1>=0)
                        if(array[i][j]==1)
                            array[i][j]+=array[i-1][j-1];
                }
            }
            int a=0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if(a<array[i][j]) a=array[i][j];
                }
            }
            System.out.println(a);


        }

}
