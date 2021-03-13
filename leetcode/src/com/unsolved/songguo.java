package com.unsolved;

import java.util.ArrayList;
import java.util.List;

/*
List<Song>  rank(List<Song>  songs, List<Integer>  ids)
s2 s1  s3 s4  s6 s5   s8 s7       1, 2, 3, 5, 9
s1 s2 s3 s5 s4 s6 s8 s7
 */
public class songguo {
   public static void  rank(List<Song> songs, List<Integer>  ids){

       ArrayList<Integer> newRank=new ArrayList<>();
       ArrayList<Integer> songsId=new ArrayList<>();//新的list
       int i=0;
       for(Song s:songs){
            songsId.add(s.getId(i))  ;
           }

       for (int j:ids){
           if(songsId.contains(j)){
               newRank.add(j);
           }
       }

       for(int k:songsId){
           if(!newRank.contains(k)){
               newRank.add(k);
           }
       }


       }

   }








class Song{
    public int getId(int id){
        return 1;
    }

}