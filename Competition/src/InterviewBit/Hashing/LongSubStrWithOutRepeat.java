/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

import java.util.HashSet;

/**
 *
 * @author akggupta
 */
public class LongSubStrWithOutRepeat {
    public static void main(String[] args) {
        String A="";
        char c[]=A.toCharArray();
        int ans=0;
        for (int i = 0; i < c.length; i++) {
            HashSet<Character> hs=new HashSet<>();
            hs.add(c[i]);
            int j;
            for (j = i+1; j < c.length; j++) {
                if(hs.contains(c[j])){break;}
                hs.add(c[j]);
            }
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}
