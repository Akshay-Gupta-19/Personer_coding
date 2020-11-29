/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.Hashing;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author akggupta
 */
public class diffKii {
    public static void main(String[] args) {
        final int[] C=Arrays.copyOf(original, 0);
        Arrays.sort(C);
        int B=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i <C.length; i++) {
            if(hs.contains(C[i]-B))return 1;
        }
        return 1;
    }
}
