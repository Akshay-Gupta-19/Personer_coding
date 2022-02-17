/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;

import java.util.Scanner;

/**
 *
 * @author avnegers
 */
public class qn25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
          char s[]=sc.next().toCharArray();
          char ts[]=sc.next().toCharArray();
          char sco[]=new char[26];
          char tco[]=new char[26];
            for (int j = 0; j < ts.length; j++) {
                tco[ts[j]-'a']++;
            }
            for (int j = 0; j < s.length; j++) {
                sco[s[j]-'a']++;
            }
            int ans=0;
            for (int j = 0; j < tco.length; j++) {
                ans+=(Math.abs(tco[j]-sco[j]));
            }
            System.out.println(ans);
        }
    }
}
