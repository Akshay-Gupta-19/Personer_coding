/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.codenigma6;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author akggupta
 */
public class MOY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();
        int ans=0;
        char digs[]=sc.next().toCharArray();
        HashSet<Character> hs=new HashSet();
        for (int i = 0; i < digs.length; i++) {
            hs.add(digs[i]);
        }
        for (int i = (int)Math.ceil(p/n); n*i<=q; i++) {
            int mn=n*i;
            if(inDig(hs,mn+""))ans++;
        }
        System.out.println(ans);
    }
    static boolean inDig(HashSet<Character> hs,String mn){
        HashSet<Character> hs2=new HashSet<>();
        hs2.addAll(hs);
        for (int i = 0; i < mn.length(); i++) {
            if(!hs.contains(mn.charAt(i)))return false;
            else hs2.remove(mn.charAt(i));
        }
        return hs2.isEmpty();
    }
}
