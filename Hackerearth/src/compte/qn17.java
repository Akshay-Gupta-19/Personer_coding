/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            char c[]=sc.next().toCharArray();
            int ctr[]=new int[26];
            for (int j = 0; j < c.length; j++) {
                ctr[c[j]-'a']++;
            }
        
       boolean visited[]=new boolean[26];
        for (int j = 0; j < 26; j++) {
            int maxi=0;
            for (int k = 0; k < 26; k++) {
                if(ctr[k]>ctr[maxi])maxi=k;
            }
            for (int k = 25; k >= 0; k--) {
                if(ctr[k]<=ctr[maxi]&&!visited[k])maxi=k;
            }
            visited[maxi]=true;
            for (int k = 0; k < ctr[maxi]; k++) {
                System.out.print((char)(maxi+'a'));
            }
        }
            System.out.println();
        }
    }
}
