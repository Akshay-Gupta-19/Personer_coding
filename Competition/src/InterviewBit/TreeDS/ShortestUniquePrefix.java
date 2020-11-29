/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.TreeDS;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class ShortestUniquePrefix {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("zebra"); al.add("dog"); al.add("duck"); al.add("dove");
        HashMap<String,Integer> hm=new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
               if(hm.containsKey(al.get(i).substring(0,j))) {
                   Integer oi = hm.get(al.get(i).substring(0,j));
                   int pm=getPM(al.get(i),al.get(oi));
                   hm.put(al.get(i).substring(0,pm+2), i);
                   hm.put(al.get(oi).substring(0,pm+2),oi);
               }
               else
                   hm.put((char)(al.get(i).charAt(0))+"",i);
            
        }
        System.out.println(hm);
    }
    static int getPM(String a,String b){
        int i=0;
        while(a.charAt(i)==b.charAt(i))i++;
        return i-1;
    }
}
