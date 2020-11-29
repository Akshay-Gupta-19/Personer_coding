/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewBit.HeapsAndMaps;

import java.util.PriorityQueue;

/**
 *
 * @author akggupta
 */
public class magicainAndChoclate {
    public static void main(String[] args) {
        int A=3;
        int B[]=new int[]{6,5};
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < B.length; i++) {
           pq.add(B[i]);
        }
        int ans=0;
        for (int i = 0; i < A; i++) {
            int ct=pq.poll();
            ans+=ct;
            pq.add(ct/2);
        }
        System.out.println(ans);
    }
}
