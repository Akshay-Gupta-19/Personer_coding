/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashingEasy;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m=sc.nextInt(),n=sc.nextInt();
            HashSet<Integer> hs=new HashSet(); 
            
            for (int j = 0; j <m; j++) {
               hs.add(sc.nextInt()); 
            }
            for (int j = 0; j < n; j++) {
                if(!hs.contains(sc.nextInt()))
                {System.out.println("No");System.exit(0);}
            }
            System.out.println("Yes");
            
        }
    }
}
