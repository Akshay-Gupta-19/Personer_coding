/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode1;
import java.util.*;
/**
 *
 * @author akggupta
 */
public class lexMinSubWithAllchar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text="";
        StringBuilder sb=new StringBuilder(text);
        int tc=0;
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            hs.add(sb.charAt(i));
        }
        tc=hs.size();
        char ans[]=new char[tc];
        for (int i = 0; i < ans.length; i++) {
            int mci=i;
            char mc='z';
            for (int j = 0; j < sb.length(); j++) {
                if(sb.indexOf( sb.charAt(j)+"",j+1)>0){
                    if(sb.charAt(j)<mc){
                        mc=sb.charAt(j);mci=j;
                    }
                }else{
                    if(sb.charAt(j)<mc){
                        mc=sb.charAt(j);mci=j;
                    }
                    sb=new StringBuilder(sb.substring(mci+1).replaceAll(mc+"", ""));
                    ans[i]=mc;
                }
            }
        }
        System.out.println(new String(ans));
    }
    
}
