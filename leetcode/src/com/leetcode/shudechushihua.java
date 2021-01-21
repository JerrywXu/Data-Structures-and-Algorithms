package com.leetcode;

/**
 * Created by 徐纪伟 on 2020/8/1.
 */
public class shudechushihua {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = null;
        p.left.right = null;
        p.right.left = new TreeNode(4);
        p.right.right = new TreeNode(5);
        //letcode4 s=new letcode4();
        flatten(p);//如何调用这个方法
        //System.out.println(s.flatten(p));
    }

    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){ data=val;}
    }

    public static void flatten(TreeNode root) {
        while (root != null) {
            //左子树为 null，直接考虑下一个节点
            if (root.left == null) {
                root = root.right;
            } else {
                // 找左子树最右边的节点
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                //将原来的右子树接到左子树的最右边节点
                pre.right = root.right;
                // 将左子树插入到右子树的地方
                root.right = root.left;
                root.left = null;
                // 考虑下一个节点
                root = root.right;

            }
        }
    }


}