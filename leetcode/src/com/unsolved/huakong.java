package com.unsolved;

import java.lang.reflect.Array;
import java.util.List;
/*
*从n,n+1,n+2...2n这n+1个数中去掉1个数，组成长度为n的有序数组x，
* 请根据数组x找出去掉的那个数，要求时间复杂度O(n)尽可能小。
* */
public class huakong {
    public static void main(String[] args) {
        int [] x={1,2,3,4,6};
        System.out.println(solve(x));
    }

    static class Node{
        int val;
      Node next;

      Node(int x){
            val=x;
        }
    }

    public static int solve (int[] x) {
       if(x==null||x.length<=0){return -1;}
       Node sn=new Node(0);//哨兵
       Node tn=sn;
       for (int i=0;i<x.length;i++){
           Node newNode=new Node(x[i]);
           tn.next=newNode;
           tn=newNode;
       }
       Node fast =sn;
       Node slow=sn;
       while(fast!=null&& fast.next!=null){
           fast=fast.next;

           if(fast.val-slow.val==2){
               return slow.val+1;
           }
           slow=slow.next;
       }
       return 0;
    }

}

