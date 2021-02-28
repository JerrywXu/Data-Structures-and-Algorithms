package com.code;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        System.out.println(isValid(s));
    }

    public static  boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(c == '(' ||c=='['||c=='{'){
                stack.add(c);
            }else {
                if(stack.isEmpty())
                    return  false;
                if(c==')'&& stack.pop()!='(')
                    return false;
                if(c==']'&& stack.pop()!='[')
                    return false;
                if(c=='}'&& stack.pop()!='{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}

