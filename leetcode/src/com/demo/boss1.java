package com.demo;

public class boss1 {
    public static void main(String[] args) {
    int []b={1,5,3,6,4};
      System.out.println(maxProfit(b));
    }
    public static int maxProfit (int[] prices) {
        int max=0;
        for (int i=0;i<prices.length;i++){
            for (int j=0;j<prices.length ;j++){
                if (j>i){
                    int sum=prices[j]-prices[i];
                    max=Math.max(max,sum);
                }
            }
        }
        return max;
    }
}
