package com.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 最大数
 * @param nums int整型一维数组
 * @return string字符串
 */
public class futu {

    public String slove( int [] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String numStrList[] = new String[nums.length];
        for (int i = 0; i < numStrList.length; i++) {
            numStrList[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        };


        Arrays.sort(numStrList,comparator);
        String s="";
        for (String string:numStrList){
            s+=string;
        }
        if(s.charAt(0)=='0'){
            return "0";
        }
        return "s";




    }

}

