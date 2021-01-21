package com.demo;

/**
 * 样例测试
 */
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class demo {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }
    public ListNode solution (ListNode head, int m, int n) {
        // write code here
        ListNode dian=new ListNode(0);
        dian.next=head;
        ListNode pre=dian;
        for(int i=1;i<m;i++)
        {
            pre=pre.next;
        }
        head=pre.next;
        for(int j=m;j<n;j++)
        {
            ListNode ne=head.next;
            head.next=ne.next;
            ne.next=pre.next;
            pre.next=ne;
        }
        return dian.next;








    }
}