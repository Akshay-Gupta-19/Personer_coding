/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compte;
import java.util.*;
/**
 *
 * @author avnegers
 */
public class qn11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        for (int i = 0; i < a1.length; i++) {
           a1[i]=sc.nextInt();
        }for (int i = 0; i < a2.length; i++) {
           a2[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < a2.length; i++) {
           if(a2[i]>=a1[i]){
               System.out.println("No");
               System.exit(0);
           } 
        }
        System.out.println("Yes");
    }
}
