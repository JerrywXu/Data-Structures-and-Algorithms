package com.leetcode;

/**
 * Created by 徐纪伟 on 2020/7/31.
 */
public class moshusuoyin {
    public static void main(String[] args) {
        int[] nums={5,6,7,8,4};
       // letcode3 a=new letcode3();
        System.out.print(findMagicIndex(nums));
    }
    public static int findMagicIndex(int[] nums) {
        for(int i=0;i<nums.length; ){
            if(nums[i]==i)
            {
                return i;

            }
            //i++;

            i=Math.max(nums[i],i+1);//必须有序，使用跳跃法。interesting【4，4，4，4】
        }
        return -1;

    }

}
