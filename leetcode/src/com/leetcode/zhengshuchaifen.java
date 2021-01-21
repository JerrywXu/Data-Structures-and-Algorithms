package com.leetcode;

/**
 * Created by 徐纪伟 on 2020/7/29.
 */
public class zhengshuchaifen {
    public static void main(String[] args) {
        zhengshuchaifen a=new zhengshuchaifen();
       System.out.println(a.integerBreak(7));
    }
    public int integerBreak(int n) {
        int[] dp = new int[n+1];//0到n+1个空间
        for (int i = 2; i <= n; i++) {//0，1不用直接从2开始
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));//不用计算求和，已经拆分了
            }
            dp[i] = curMax;
        }
        return dp[n];
    }


}
