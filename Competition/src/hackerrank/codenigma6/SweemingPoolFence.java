/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.codenigma6;

/**
 *
 * @author akggupta
 */
import java.util.*;
public class SweemingPoolFence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--){
            int l=sc.nextInt();
            int ch[]=new int[l];
            int ci[]=new int[l];
            for (int i = 0; i < ch.length; i++) {
                ch[i]=sc.nextInt();
            }
            for (int i = 0; i < ci.length; i++) {
                ci[i]=sc.nextInt();
            }
            int ans=Integer.MAX_VALUE;
            for (int i = 0; i < ci.length; i++) {
                int oans=fi(ch,ci,cl[i]);
                ans=Math.min(ans,oans);
            }
        }
    }
    static int fi(int cl[],int ci,int ct){
        int tc=0;
        for (int i = 0; i < cl.length; i++) {
            tc+=Math.abs((cl[i]-ct)*ci[i]);
        }
        return tc;
    }
}

