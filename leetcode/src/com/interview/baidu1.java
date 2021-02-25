package com.interview;

import java.util.Stack;
/*
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * */
public class baidu1{
    public static void main(String[] args) {

        System.out.println( Valid("())"));
    }

    public static boolean Valid(String s){

        Stack<Character> stack=new Stack<>();
        char [] chars = s.toCharArray();
        for(char c: chars){
            if(c == '(' || c == '[' || c== '{'){
                stack.add(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                if (c == ')' && stack.pop() != '('){
                    return false;
                }
                if (c == '}' && stack.pop() != '{'){
                    return false;
                }
                if (c == '}' && stack.pop() != '{'){
                    return false;
                }

            }
        }
        return  stack.isEmpty();
    }

}

