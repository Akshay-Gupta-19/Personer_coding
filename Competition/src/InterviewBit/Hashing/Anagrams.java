/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

/**
 *
 * @author akggupta
 */
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        String A[]=new String[]{};
        HashMap<String,ArrayList<Integer>> al=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            char sortedChar[]=A[i].toCharArray();
            Arrays.sort(sortedChar);
            String cs=new String(sortedChar);
            if(!al.containsKey(cs))al.put(cs, new ArrayList<>());
            al.get(cs).add(i);
        }
        Iterator<String> it=al.keySet().iterator();
        int ans[][]=new int[al.size()][];
        for(int j=0;it.hasNext();j++){
            ArrayList<Integer> al2=al.get(it.next());
            ans[j]=new int[al2.size()];
            for (int i = 0; i < al2.size(); i++) {
                ans[j][i]=al2.get(i);
            }
        }
        System.out.println(ans);
        //return ans;
    }
}
