package com.code;

public class demo58_1 {
    public static void main(String[] args) {

    }
    public String longestPalindrom (String string) {
        // write code here
        int length=string.length();
        if(length<2){
            return string;
        }

        int maxLEN=1;
        int begin=0;
        boolean[][] dp=new boolean[length][length];//判断回文串

        for(int i=0;i<length;i++){//初始化
            dp[i][i]=true;
        }

        char[] charArray= string.toCharArray();
        //递推开始，枚举子串长度
        for (int L=2;L<=length;L++){
            for(int i=0;i<length;i++){
                int j=L+i-1;

                if(j>=length){
                    break;
                }

                if (charArray[i] != charArray[j]){
                    dp[i][j]=false;
                }else {
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                if (dp[i][j] && j-i+1>maxLEN){
                    maxLEN=j-i+1;
                    begin=i;
                }
            }
        }
        return string.substring(begin,begin+maxLEN);
    }
}
