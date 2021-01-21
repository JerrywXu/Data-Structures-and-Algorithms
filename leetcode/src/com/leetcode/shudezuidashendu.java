package com.leetcode;

import java.util.LinkedList;

/**
 * Created by 徐纪伟 on 2020/7/27.
 * 求二叉树层数
 */
public class shudezuidashendu {
    public static void main(String args[]){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = null;
        p.left.right = null;
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(5);
        System.out.println(maxDepth(p));
        //TreeNode(1);
    }
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){ data=val;}
    }
/*
    private  static int TreeNode(int val)静态方法要拿出来写
    {
        data = val;
    }
*/

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //BFS的层次遍历思想，记录二叉树的层数，
        //遍历完，层数即为最大深度
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);//添加第一层到列表
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            maxDepth++;
            int levelSize = queue.size();//该层节点元素的个数
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();//出队操作
                if (node.left != null) {
                    queue.add(node.left);//入队操作
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return maxDepth;
    }
}
