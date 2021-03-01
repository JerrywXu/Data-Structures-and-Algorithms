package com.code;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    /**
     * @param a     待排序列
     * @param left  待排序列起始位置
     * @param right 待排序列结束位置
     */
    public static void quickSort(int[] a, int left, int right) {
        if (left > right)
            return;
        int pivot = a[left];//定义基准值为数组第一个数
        int i = left;
        int j = right;

        while (i < j) {
            while (pivot <= a[j] && i < j)//从右往左找比基准值小的数
                j--;
            while (pivot >= a[i] && i < j)//从左往右找比基准值大的数
                i++;
            if (i < j)                     //如果i<j，交换它们
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[left] = a[i];
        a[i] = pivot;//把基准值放到合适的位置
        quickSort(a, left, i - 1);//对左边的子数组进行快速排序
        quickSort(a, i + 1, right);//对右边的子数组进行快速排序
    }
}