package com.leetcode;

public class binarytreesum {

    public class Node {
        public int v;  // 值
        public Node l; // 左孩子
        public Node r; // 右孩子

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        public Node getL() {
            return l;
        }

        public void setL(Node l) {
            this.l = l;
        }

        public Node getR() {
            return r;
        }

        public void setR(Node r) {
            this.r = r;
        }

        @Override
        public String toString() {
            return "Node{}";
        }
    }



    public int sum(Node root) {
        int sum1=0;
        if(null!=root) {
            sum1 = sum1 + root.getV();
            sum(root.getR());
            sum(root.getL());
        }
        return sum1;
    }


}

