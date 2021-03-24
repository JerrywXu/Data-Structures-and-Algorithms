package com.interview;

import java.util.ArrayDeque;

public class erchasousuo {

    private class TreeNode{
        int val=0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val=val;
        }

    }

    public int[] findError (TreeNode root) {
        int[] res=new int[2];
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        TreeNode cur=root;
        TreeNode point = null;
        while (!queue.isEmpty()||cur!=null){
            if (cur != null){
                queue.addLast(cur);
                cur = cur.left;
            }else {
                cur=queue.pollLast();
                if(point != null && point.val > cur.val){
                    res[1] = res[1]== 0 ? point.val : res[1];
                    res[0] = cur.val;
                }
                point=cur;
                cur=cur.right;
            }
        }
        return res;

    }

}
