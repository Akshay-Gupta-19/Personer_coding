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
public class GroupAnagram49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String currentStr = strs[i];
            char[] toCharArray = currentStr.toCharArray();
            Arrays.sort(toCharArray);
            String head = new String(toCharArray);
            hm.putIfAbsent(head, new ArrayList<>());
            hm.get(head).add(currentStr);
        }
       List<List<String>> al=new ArrayList<>();
        Iterator<String> it=hm.keySet().iterator();
        while(it.hasNext()){
            String head=it.next();
            al.add(hm.get(head));
        }
        return al;
    }
}
