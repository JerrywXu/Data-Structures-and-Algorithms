package com.interview;

import java.util.ArrayList;
import java.util.List;

public class daxi1 {
    public static void main(String[] args) {

    }


    public List<String> readBinaryWatch(int num){ //num 0-10
        List<String> list=new ArrayList();

        for(int i=0;i<12;i++) {
            for(int j=0;j<60;j++){
                if(numberOfOne(i)+numberOfOne(j) == num){
                    String time = i + "：" + (j>=10 ? j: "0" + j);
                    list.add(time);
                }
            }
        }
        return list;
    }

    public  int numberOfOne(int value){  //计算小时 与分钟 的亮灯数量
        int count = 0;
        while (value>0){
            if((value & 1) == 1){
                count++;
            }
            value >>= 1;
        }
        return count;
    }
}
