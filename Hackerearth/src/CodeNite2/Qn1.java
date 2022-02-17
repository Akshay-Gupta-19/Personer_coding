/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeNite2;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        xyz:  for (int i = 0; i < t; i++) {
            char s[]=sc.next().toCharArray();
            char u[]=sc.next().toCharArray();
            int k=sc.nextInt();
            for (int j = 0; j <= s.length-u.length; j++) {
                int matchCount=0;
                for (int l = j; l < u.length+j; l++) {
                    if(s[l]==u[l-j])matchCount++;
                }
                if(matchCount>=k){
                    System.out.println("Yes");
                    continue xyz;
                }
            }
            System.out.println("No");
        }
    }
}
