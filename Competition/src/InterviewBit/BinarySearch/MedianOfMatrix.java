/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author akggupta
 */
public class MedianOfMatrix {
    public static void main(String[] args) {
        int A[][]=new int[][]{{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                al.add(A[i][j]);
            }
        }
        Collections.sort(al);
        if(al.size()%2==0){
            System.out.println((al.get(al.size()/2)+al.get(al.size()/2-1))/2);
        }
        else
            System.out.println(al.get(al.size()/2));
    }
    static int pos(int x,int A[][]){
        int ans=0;
        for (int[] A1 : A) {
            int pos = Arrays.binarySearch(A1, x);
            if(pos>=0)ans+=(pos+1);
            else ans=ans-(pos+1);
        }
        return ans-1;
    }
}
