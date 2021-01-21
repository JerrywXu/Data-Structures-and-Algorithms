package com.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class demo {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);

        Map<String,String>map=new HashMap<String,String>();
        map.put("a","1");
        map.put("c","2");
        map.put("b","1");
        System.out.println(map);

        String str="123";
        StringBuffer st=new StringBuffer(str);

       System.out.println(st.reverse().toString());





    }

}
