/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UbonaDeveloper;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            char c[]=sc.next().toCharArray();
            long ans=1;
            HashSet<Character> hs=new HashSet<>();
            for (int j = 0; j < c.length; j++) {
               if(c[j]=='_')ans*=hs.size();
               if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u')hs.add(c[j]);
            }
            System.out.println(ans);
        }
    }
}
