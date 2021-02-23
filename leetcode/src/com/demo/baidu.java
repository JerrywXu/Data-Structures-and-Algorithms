package com.demo;

import java.lang.reflect.Array;
import java.util.*;
public class baidu {
    /**
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public static void main(String[] args) {
        int [] number={1,2,3,4,5};
        int [] result= twoSum(number,5);
      System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum (int[] numbers, int target) {
        int len = numbers.length;
        int[] result = new int[2];
        //map里面放 键为target-每个数的结果 值为下标
        //每次放入的时候看是否包含 当前值
        //有的话说明当前值和已包含的值下标的那个元素为需要的结果
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(map.containsKey(numbers[i])){
                result[0] = map.get(numbers[i])+1;
                result[1] = i+1;
                break;
            }else{
                map.put(target-numbers[i],i);
            }
        }
        return result;
    }
}
