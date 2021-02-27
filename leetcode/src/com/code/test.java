package com.code;

public class test {
    public static void main(String[] args) {

    }

    public class  ListNode{
        int val;
         ListNode next;
         ListNode(int x){
             val=x;
         }
    }

    public ListNode Mergr (ListNode headA,ListNode headB){
        ListNode node=new ListNode(-1);
        ListNode tempNode=node;
        while (headA!=null&&headB!=null){
            if(headA.val>headB.val){
                node.next=headB;
                node=headB;
                headB=headB.next;

            }else {
                node.next=headA;
                node=headA;
                headA=headA.next;
            }
        }
        if(headA!=null){
            node.next=headA;
        }
        if (headB!=null){
            node.next=headB;
        }
        return tempNode.next;


    }
}
