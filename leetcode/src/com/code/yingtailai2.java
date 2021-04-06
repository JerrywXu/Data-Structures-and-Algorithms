package com.code;

import java.util.ArrayList;
import java.util.List;

public class yingtailai2 {
    public static void main(String[] args) {
        System.out.print(getSheeps(15));
    }
    static class Sheep{
        public int age=0;
    }
    public static int getSheeps(int n){
        ArrayList<Sheep> sheeps=new ArrayList<Sheep>();
        sheeps.add(new Sheep());
        List<Sheep> addSheeps=new ArrayList<Sheep>();
        List<Sheep> delSheeps=new ArrayList<Sheep>();
        for (int i=1;i<n;i++){
            for (Sheep s:sheeps){
                s.age++;
                if (s.age==2||s.age==4){
                    addSheeps.add(new Sheep());
                }else if (s.age==5){
                    delSheeps.add(s);
                }
            }
            sheeps.addAll(addSheeps);
            sheeps.removeAll(delSheeps);
            addSheeps.clear();

            delSheeps.clear();
        }
        return sheeps.size();
    }
}
