package com.demo;

public class shapeqianshou {
    public int minSwap(int[] row){
        int ans=0;
        for(int i=0;i<row.length-1;i+=2){
            int mn=Math.min(row[i],row[i+1]);
            int mx=Math.max(row[i],row[i+1]);
            if(mx%2!=0&& mx-mn==1)continue;
            for (int j=i+2;j<row.length;j++){
                if (row[i]%2==0 && row[j]==row[i]+1||row[i]%2!=0&&row[j]==row[i]-1){
                    int tmp=row[i+1];
                    row[i+1]=row[j];
                    row[j]=tmp;
                    ans++;
                }
            }
        }
        return ans;
    }

}
