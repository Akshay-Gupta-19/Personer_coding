/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeWeekly188;

import java.util.*;

/**
 *
 * @author akggupta
 */
public class BuildArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public List<String> buildArray(int[] target, int n) {
         List<String> ans=new ArrayList<>();
         int mn=1;
         for (int i = 0; i < target.length; i++) {
             if(target[i]!=mn){
                 ans.add("push");
                 ans.add("pop");
                 i--;
             }
             else{
                 ans.add("push");
             }
             mn++;
         }
         return ans;
    }
}
