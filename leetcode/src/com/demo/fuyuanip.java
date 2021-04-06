package com.demo;

import java.util.ArrayList;
import java.util.List;

public class fuyuanip {
    List<String> rlist =new ArrayList<>();
    public List<String> restoreIpAddresses(String s){
        if (s.length()<4){
            return rlist;
        }
        split(s,0,1);
        return rlist;
    }


    private void split(String s,int l,int seq){
        if(seq!=4){
            for(int i=1;i<=3;i++){
                if (l+i<=s.length()){
                    int sub=Integer.parseInt(s.substring(l,l+i));
                    if (sub>=0&&sub<256){
                        StringBuilder sb=new StringBuilder(s);
                        sb.insert(l+i,".");
                        split(sb.toString(),l+i,seq+1);
                    }
                    if (sub==0){
                        break;
                    }
                }else {
                    break;
                }
            }
        }else if(seq==4&&l<s.length()&&s.length()-l<=3){
            if(Integer.parseInt(s.substring(l,s.length()))<256&&!((s.length()-l)>l&&s.charAt(l)=='0')){
                rlist.add(s);
            }
        }
    }

}

