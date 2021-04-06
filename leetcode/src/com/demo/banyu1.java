package com.demo;

public class banyu1 {
    public static void main(String[] args) {

    }
    public boolean validMountainArray (int[] arr) {

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]&&arr[i]<arr[i+1])
                return true;

        }
        return false;
    }
}
