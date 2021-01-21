package com.leetcode;

/**
 * Created by 徐纪伟 on 2020/8/7.
 */
public class panduanxiangtongshu {
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        TreeNode q=new TreeNode(2);
       // TreeNode s=new TreeNode(1,5,6);

        p.left=new TreeNode(4);
        p.right=new TreeNode(5);
        q.left=new TreeNode(4);
        q.right=new TreeNode(5);
        System.out.println(isSameTree(p,q));

    }

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) { //这个方法如何使用？
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    public  static boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null&&q==null)
        {
            return true;
        }else if(p==null||q==null)
        {
            return false;
        }else if(p.val!=q.val)
        {
            return false;
        }else
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

    }
}
